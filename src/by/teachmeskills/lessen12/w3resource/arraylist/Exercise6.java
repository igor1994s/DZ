package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//УДАЛЕНИЕ ЭЛЕМЕНТА ИЗ КОЛЛЕКЦИИ.
public class Exercise6 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orenge");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        listString.remove(2);
        System.out.println(listString);
    }
}
