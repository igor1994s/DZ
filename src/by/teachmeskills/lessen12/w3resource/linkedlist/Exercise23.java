package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//ПРЕОБРАЗОАНИЕ LinkedList В ArrayList.
public class Exercise23 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        List<String> lList2=new ArrayList<>(lList);
        System.out.println(lList2);
    }
}
