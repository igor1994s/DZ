package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВОЗВРАЩАЕМ ЗНАЧЕНИЕ ПЕРВОГО ЭЛЕМЕНТА, НО НЕУДАЛЯЕМ ЕГО.
public class Exercise20 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        System.out.println(lList.peekFirst());
        System.out.println(lList);
    }
}
