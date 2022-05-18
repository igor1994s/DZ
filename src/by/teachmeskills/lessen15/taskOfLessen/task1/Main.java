package by.teachmeskills.lessen15.taskOfLessen.task1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Hobby hobby1 = new Hobby("IT", new Random().nextInt(11));
        Hobby hobby2 = new Hobby("Movie", new Random().nextInt(11));
        Hobby hobby3 = new Hobby("Squash", new Random().nextInt(11));

        People people1 = new People("Danbiil", 22, Gender.MALE, List.of(hobby1, hobby2));
        People people2 = new People("Klim", 18, Gender.MALE, List.of(hobby1));
        People people3 = new People("Victor", 35, Gender.MALE, List.of(hobby1, hobby3));
        People people4 = new People("Artyom", 23, Gender.MALE, List.of(hobby3, hobby2));
        People people5 = new People("Nastia", 20, Gender.FEMALE, List.of(hobby1, hobby2, hobby3));

        List<People> peoples = List.of(people1, people2, people3, people4, people5);

        double average = peoples.stream().mapToInt(People::getAge).average().orElse(0);

        //System.out.println(average);

        //Task2
        List<People> malePeople = peoples.stream().filter(people -> people.getGender() == Gender.MALE).toList();
        //System.out.println(malePeople);

        //Task3^^
        List<People> hobPeople = peoples.stream()
                .filter(people -> people.getHobbies().stream()
                        .anyMatch(hobby -> hobby.getName().equals("IT"))) //anyMatch - проверяет на совпадения, что хотябы одно значение из потока соответсвует ищ щеачме
                .toList();
        //System.out.println(hobPeople);

        //Task4
        List<People> hobPeopleAv = peoples.stream()
                .filter(people -> people.getHobbies().size() >= 2)
                .filter(p -> p.getHobbies().stream()
                        .filter(hobby -> hobby.getMark() > 1).peek(System.out::println).toList().size() >= 2) //anyMatch - проверяет на совпадения, что хотябы одно значение из потока соответсвует ищ щеачме
                .toList();
        System.out.println("----------------------------------------------------");

        //System.out.println(hobPeopleAv);

        //Task5
        peoples.stream().filter(p -> PeopleBirthdayInfo.isLeapYear(p.getAge())).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        peoples.stream().filter(p -> {
                    String nameToLowerCase = p.getName().toLowerCase();
                    return nameToLowerCase.contains("a") && !nameToLowerCase.contains("b");
                })
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        peoples.stream().sorted(new ComporatorName().reversed()).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        peoples.stream().sorted(new ComporatorHobby()).forEach(System.out::println);
        System.out.println("----------------------------------------------------");
        System.out.println(peoples.stream().min(Comparator.comparingInt(People::getAge)
                .reversed().thenComparing(new ComporatorHobby())).orElse(new People()));
        System.out.println("----------------------------------------------------");
        String hello = "Hello";

        Arrays.stream(hello.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.printf("%s=%d",k,v));


    }
}

