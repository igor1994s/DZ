package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//ИЗМЕНЕНИЕ ЗНАЧЕНИЯ В КОЛЛЕКЦИИ.
public class Exercise5 {
    public static void main(String[] args) {
        List<String> listString=new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orenge");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        listString.set(1,"Blue");
        listString.set(2,"Yelloy");
        System.out.println(listString);
    }
}
