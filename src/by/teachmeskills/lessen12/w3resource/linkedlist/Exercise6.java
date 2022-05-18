package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВСТАВКА ЭЛЕМЕНТОВ НА ПЕРВУЮ И ПОСЛЕДНЮЮ ПОЗИЦИЮ КОЛЛЕКЦИИ.
public class Exercise6 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        lList.addFirst("Black");
        lList.addLast("Blue");
        System.out.println(lList);
    }
}
