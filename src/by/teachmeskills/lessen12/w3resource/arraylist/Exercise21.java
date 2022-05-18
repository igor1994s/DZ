package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
//ЗАМЕНА ЭЛЕМЕНТА В КОЛЛЕКЦИИ.
public class Exercise21 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        System.out.println(listString);
        listString.set(1,"White");
        System.out.println(listString);
    }
}
