package by.teachmeskills.lessen15.task3;

//Метод distinct возвращает stream без дубликатов, при этом для упорядоченного стрима (например, коллекция на основе list)
// порядок стабилен, для неупорядоченного — порядок не гарантируется. Рассмотрим результаты работы над коллекцией Collection ordered =
// Arrays.asList(«a1», «a2», «a2», «a3», «a1», «a2», «a2») и Collection nonOrdered = new HashSet<>(ordered).
//
//        Получение коллекции без дубликатов из неупорядоченного стрима - [a1, a2, a3] — порядок не гарантируется.
//        Получение коллекции без дубликатов из упорядоченного стрима - [a1, a2, a3] — порядок гарантируется.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Collection<String> ordered= new ArrayList<>(Arrays.asList("a1","a2","a2","a3","a1","a2","a2"));
        Collection<String> nonordered=new HashSet<>(ordered);
        ordered.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("--");
        nonordered.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

}
