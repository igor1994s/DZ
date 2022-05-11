package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВОЗВРАЩАЕМ ЗНАЧЕНИЕ ПЕРВОГО ЭЛЕМЕНТА И УДАЛЯЕМ ЕГО.
public class Exercise19 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        System.out.println(lList.pop());
        System.out.println(lList);
    }
}
