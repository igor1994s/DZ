package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//ЕСТЬ ЛИ ДАННОЕ (ЗНАЧЕНИЕ) В КОЛЛЕКЦИИ?
public class Exercise7 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orenge");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
        if(listString.contains("Green")){
            System.out.println("Found the element");
        }else{
            System.out.println("element not found");
        }
    }
}
