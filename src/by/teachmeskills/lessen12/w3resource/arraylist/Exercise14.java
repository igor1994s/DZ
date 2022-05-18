package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//МЕНЯЕМ МЕСТАМИ ЭЛЕМЕНТЫ В КОЛЛЕКЦИИ.
public class Exercise14 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        Collections.swap(listString,0,2);
        System.out.println(listString);
    }
}
