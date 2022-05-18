package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//СРАВНЕНИЕ ДВУХ СВЯЗАННЫХ СПИСКОВ.
public class Exercise24 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Blue");
        System.out.println(lList);
        List<String> lList2=new LinkedList<>();
        lList2.add("Orange");
        lList2.add("White");
        lList2.add("Green");
        System.out.println(lList2);
        List<String> lList3=new LinkedList<>();
        for (String s:lList){
            lList3.add(lList2.contains(s)?"Yes":"No");
        }
        System.out.println(lList3);
    }
}
