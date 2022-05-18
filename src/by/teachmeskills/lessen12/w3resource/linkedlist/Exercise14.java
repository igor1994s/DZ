package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//УДАЛЕНИЕ ВСЕХ ЭЛЕМЕНТОВ СВЯЗАННОГО СПИСКА.
public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        lList.removeAll(lList);
        System.out.println(lList);
    }
}
