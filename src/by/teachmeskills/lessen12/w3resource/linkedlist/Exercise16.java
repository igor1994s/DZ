package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
//ПЕРЕМЕШИВАНИЕ ЭЛЕМЕНТОВ В СВЯЗАННОМ СПИСКЕ.
public class Exercise16 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        Collections.shuffle(lList);
        System.out.println(lList);
    }
}
