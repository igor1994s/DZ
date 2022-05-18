package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВСТАВКА ЭЛЕМЕНТА В КОЛЛЕКЦИЮ НА ОПРЕДЕЛЕННУЮ ПОЗИЦИЮ.
public class Exercise5 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        lList.add(1,"Blue");
        System.out.println(lList);
    }
}
