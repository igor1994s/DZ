package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//СОРТИРОВКА КОЛЛЕКЦИИ ПО АЛФАВИТУ.
public class Exercise8 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        Collections.sort(listString);
        System.out.println(listString);
    }
}
