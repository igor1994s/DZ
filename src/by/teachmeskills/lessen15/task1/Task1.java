package by.teachmeskills.lessen15.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //количесто а1 в списке.
        List<String> list = new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        int count = (int) list.stream().filter(p->p=="a1").count();
        System.out.printf("Количество элементов \"а1\" в списке равно: %d\n", count);
        //первый элемент в списке.
        String first = list.stream().findFirst().orElse("0");
        System.out.printf("Первый элемент в списке это: %s\n",first);
        //последний элемент в списке.
        String last = list.stream().skip(list.size()-1).findFirst().orElse("empty");
        System.out.printf("Последний элемент в списке это: %s\n",last);
        //найти "а3" или бросить ошибку.
        System.out.println(list.stream().filter(p->p=="a3").findAny().orElseThrow());
        //вернуть 3 элемент из списка.
        System.out.println(list.stream().skip(3-1).findFirst().get());
        //Вернуть два элемента начиная со второго
        list.stream().skip(1).limit(2).forEach(s-> System.out.print(s+" "));
        System.out.println();
        //Выбрать все элементы по шаблону.
        list.stream().filter(p->p=="a1").forEach(s-> System.out.print(s+" "));
    }
}
