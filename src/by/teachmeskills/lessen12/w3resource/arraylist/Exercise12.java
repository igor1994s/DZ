package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//ВЫРЕЗАТЬ ЧАСТЬ КОЛЛЕКЦИИ.
public class Exercise12 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        List<String> listString2=listString.subList(0,2);
        System.out.println(listString2);
    }
}
