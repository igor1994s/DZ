package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//СУЩЕСТВУЕТ ЛИ ДАННЫЙ ЭЛЕМЕНТ В СПИСКЕ?
public class Exercise22 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        System.out.println(lList.contains("White"));
    }
}
