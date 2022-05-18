package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ПУСТОЙ СПИСОК ИЛИ НЕТ?
public class Exercise25 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Blue");
        System.out.println(lList);
        System.out.println(lList.isEmpty());
        lList.removeAll(lList);
        System.out.println(lList.isEmpty());
    }
}
