package by.teachmeskills.lessen15.task5;

//даны две коллекции collection1 = Arrays.asList(«a1», «a2», «a3», «a1») и collection2 = Arrays.asList(«1,2,0», «4,5»),
//давайте посмотрим как её можно обрабатывать используя различные map функции:
//
//        Добавить "_1" к каждому элементу первой коллекции - [a1_1, a2_1, a3_1, a1_1]
//        В первой коллекции убрать первый символ и вернуть массив чисел (int[]) - [1, 2, 3, 1]
//        Из второй коллекции получить все числа, перечисленные через запятую из всех элементов	 - [1, 2, 0, 4, 5]
//        Из второй коллекции получить сумму всех чисел, перечисленных через запятую - 12

//        Обратите внимание: все map функции могут вернуть объект другого типа (класса), то есть map может работать со
//        стримом строк, а на выходе дать Stream из значений Integer или получать класс людей People, а возвращать класс
//        Office, где эти люди работают и т.п., flatMap (flatMapToInt и т.п.) на выходе должны возвращать стрим с одним,
//        несколькими или ни одним элементов для каждого элемента входящего стрима (см. последние два примера).

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> collection1 =new ArrayList<>(Arrays.asList("a1", "a2", "a3", "a1"));
        List<String> collection2 =new ArrayList<>(Arrays.asList("1,2,0", "4,5"));
        System.out.println(collection1.stream().map(c->c+"_1").collect(Collectors.toList()));
        System.out.println(Arrays.toString(collection1.stream().mapToInt(c->Integer.parseInt(c.substring(1))).toArray()));
        System.out.println(Arrays.toString(collection2.stream().flatMap((p) -> Arrays.stream(p.split(","))).toArray(String[]::new)));
        System.out.println(collection2.stream().flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::parseInt)).sum());
    }
}
