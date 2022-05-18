package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        for (String s:lList) {
            System.out.println(s);
        }
    }
}
