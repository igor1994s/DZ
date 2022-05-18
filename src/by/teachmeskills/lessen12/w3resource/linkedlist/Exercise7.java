package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВСТАВКА ЭЛЕМЕНТА НА ПЕРВУЮ ПОЗИЦИЮ.
public class Exercise7 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        lList.offerFirst("Blue");
        System.out.println(lList);
    }
}
