package by.teachmeskills.lessen15.task4;

// дана коллекция строк Arrays.asList(«a1», «a2», «a3», «a1»), давайте посмотрим, как её можно обрабатывать используя Match функции:
//         Найти существуют ли хоть один «a1» элемент в коллекции - true
//         Найти существуют ли хоть один «a8» элемент в коллекции - false
//         Найти есть ли символ «1» у всех элементов коллекции	- false
//         Проверить что не существуют ни одного «a7» элемента в коллекции	- true

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        System.out.println(list.stream().anyMatch(p->p.equals("a1")));
        System.out.println(list.stream().anyMatch(p->p.equals("a8")));
        System.out.println(list.stream().allMatch(p->p.contains("1")));
        System.out.println(list.stream().noneMatch(p->p.equals("a7")));
    }
}
