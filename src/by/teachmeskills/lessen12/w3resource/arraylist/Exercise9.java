package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//КОПИРОВАНИЕ ОДНОЙ КОЛЛЕКЦИИ В ДРУГУЮ С ЗАМЕНОЙ.
public class Exercise9 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        List<String>listString2=new ArrayList<>();
        listString2.add("123");
        listString2.add("123");
        System.out.println(listString2);
        Collections.copy(listString,listString2);
        System.out.println(listString);
    }
}
