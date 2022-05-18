package by.teachmeskills.lessen15.task2;

//дана коллекция класс People (с полями name — имя, age — возраст, sex — пол), вида Arrays.asList( new People(«Вася», 16, Sex.MAN),
// new People(«Петя», 23, Sex.MAN), new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)):
//
//        Выбрать мужчин-военнообязанных (от 18 до 27 лет) - [{name='Петя', age=23, sex=MAN}]
//        Найти средний возраст среди мужчин - 36.0
//        Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)


import java.util.ArrayList;
import java.util.Arrays;

import static by.teachmeskills.lessen15.task2.Sex.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<People> people = new ArrayList<>(Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN), new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)));
        people.stream().filter(p -> p.getSex() == MAN)
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 27)
                .forEach(s -> System.out.println(s));
        System.out.println("Средний созраст мужчин: "+people.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .mapToDouble(People::getAge)
                .average().getAsDouble());
        System.out.println("Количество потенциально работоспособных человек: "+people.stream()
                .filter(p->(p.getAge()>=18&&p.getAge()<=60&&p.getSex()==MAN)||
                        (p.getAge()>=18&&p.getAge()<=55&&p.getSex()==WOMEN)).count());
    }
}

