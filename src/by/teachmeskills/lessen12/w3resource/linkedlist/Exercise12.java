package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//УДАЛЕНИЕ УКАЗАННОГО ЭЛЕМЕНТА ИЗ СВЯЗАННОГО СПИСКА.
public class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        lList.remove(2);
        System.out.println(lList);
    }
}
