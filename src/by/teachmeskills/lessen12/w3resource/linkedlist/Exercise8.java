package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;

//ВСТАВКА ЭЛЕМЕНТА НА ПОСЛЕДНЮЮ ПОЗИЦИЮ.
public class Exercise8 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        lList.offerLast("Blue");
        System.out.println(lList);
    }
}
