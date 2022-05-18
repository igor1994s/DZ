package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
//ВЫВОД ЭЛЕМЕНТОВ КОЛЛЕКЦИИ В ОБРАТНОМ ПОРЯДКЕ.
public class Exercise4 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        System.out.println(lList);
        Iterator it=lList.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
