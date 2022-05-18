package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
//ВЗАИМОЗАМЕНА ЭЛЕМЕНТОВ В СВЯЗАННОМ СПИСКЕ.
public class Exercise15 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        Collections.swap(lList, 0,3);
        System.out.println(lList);
    }
}
