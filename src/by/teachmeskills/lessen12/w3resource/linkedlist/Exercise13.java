package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//УДАЛЕНИЕ ПЕРВОГО И ПОСЛЕДНЕГО ЭЛЕМЕНТОВ СВЯЗАННОГО СПИСКА.
public class Exercise13 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        lList.removeFirst();
        lList.removeLast();
        System.out.println(lList);
    }
}
