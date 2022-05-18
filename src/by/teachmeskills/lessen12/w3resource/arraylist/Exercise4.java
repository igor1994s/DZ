package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//ОПРЕДЕЛЕНИЕ ЗНАЧЕНИЯ ЭЛЕМЕНТА В КОЛЛЕКЦИИ.
public class Exercise4 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orenge");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        System.out.println("First elrment: "+listString.get(0));
        System.out.println("Third element: "+listString.get(2));
    }
}
