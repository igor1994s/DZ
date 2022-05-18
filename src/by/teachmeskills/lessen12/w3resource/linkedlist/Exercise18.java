package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
//КЛОНИРОВАНИЕ СВЯЗАННОГО СПИСКА.
public class Exercise18 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        LinkedList<String> lList2=(LinkedList)lList.clone();
        System.out.println(lList2);
    }
}
