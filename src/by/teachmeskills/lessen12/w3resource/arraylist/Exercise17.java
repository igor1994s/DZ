package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
//УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ КОЛЛЕКЦИИ.
public class Exercise17 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        listString.removeAll(listString);
        System.out.println(listString);
    }
}
