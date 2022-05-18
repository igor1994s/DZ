package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВЫВОД ЭЛЕМЕНТОВ КОЛЛЕКЦИИ С ОПРЕДЕЛЕННОГО ИНДЕКСА.
public class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        for (int i = 2; i < lList.size(); i++) {
            System.out.println(lList.get(i));
        }
    }
}
