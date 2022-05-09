package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
//ИЗМЕНЕНИЕ РАЗМЕРА КОЛЛЕКЙИИ.
public class Exercise20 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>(5);
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        listString.ensureCapacity(8);
        listString.add("123");
        listString.add("23");
        listString.add("3");
        System.out.println(listString);
    }
}
