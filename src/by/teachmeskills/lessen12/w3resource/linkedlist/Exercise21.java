package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВОЗВРАЩАЕМ ЗНАЧЕНИЕ ПОСЛЕДНЕГО ЭЛЕМЕНТА, НО НЕУДАЛЯЕМ ЕГО.
public class Exercise21 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        System.out.println(lList.peekLast());
        System.out.println(lList);
    }
}
