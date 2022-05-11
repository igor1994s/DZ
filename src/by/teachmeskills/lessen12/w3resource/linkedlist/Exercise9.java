package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВСТАВКА КОЛЛЕКЦИИ В ОПРЕДЕЛЕННУЮ ПОЗИЦИЮ ДРУГОЙ КОЛЛЕКЦИИ.
public class Exercise9 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        LinkedList<String> lList2 = new LinkedList<>();
        lList2.add("Blue");
        lList2.add("Yellow");
        lList.addAll(1,lList2);
        System.out.println(lList);
    }
}
