package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//КЛОНИРОВАНИЕ КОЛЛЕКЦИИ.
public class Exercise16 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        ArrayList<String> listString2 = (ArrayList<String>) listString.clone();
        System.out.println(listString2);
    }
}
