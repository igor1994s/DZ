package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
//ДОБАВЛЕНИЕ ДВУХ СВЯЗАННЫХ СПИСКОВ В ТРЕТИЙ.
public class Exercise17 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        LinkedList<String> lList2 = new LinkedList<>();
        lList2.add("123");
        lList2.add("23");
        LinkedList<String> lList3 = new LinkedList<>();
        System.out.println(lList);
        System.out.println(lList2);
        System.out.println(lList3);
        lList3.addAll(lList);
        lList3.addAll(lList2);
        System.out.println(lList);
        System.out.println(lList2);
        System.out.println(lList3);
    }
}
