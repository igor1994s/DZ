package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
//КОЛЛЕКЦИЯ ПУСТАЯ ИЛИ НЕТ?
public class Exercise18 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString.isEmpty());
        listString.removeAll(listString);
        System.out.println(listString.isEmpty());
    }
}
