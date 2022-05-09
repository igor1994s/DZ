package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//ДОБАВЛЕНИЕ ЭЛЕМЕНТОВ ДВУХ КОЛЛЕКЦИЙ В ТРЕТЬЮ.
public class Exercise15 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        List<String> listString2 = new ArrayList<>();
        listString2.add("1");
        listString2.add("2");
        listString2.add("3");
        listString2.add("4");
        listString2.add("5");
        System.out.println(listString);
        System.out.println(listString2);
        List<String> listString3=new ArrayList<>();
        listString3.addAll(listString2);
        listString3.addAll(listString);
        System.out.println(listString3);
    }
}
