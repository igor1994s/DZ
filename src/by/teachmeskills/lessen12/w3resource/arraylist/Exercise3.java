package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> listString=new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orenge");
        listString.add(0,"White");
        listString.add(0,"Black");
        for (String element:listString) {
            System.out.println(element);
        }
    }
}
