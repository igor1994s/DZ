package by.teachmeskills.lessen12.w3resource.linkedlist;

import java.util.LinkedList;
//ВЫВОД НОМЕРА ЭЛЕМЕНТА И ЕГО ЗНАЧЕНИЯ.
public class Exercise11 {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Orange");
        lList.add("White");
        lList.add("Green");
        System.out.println(lList);
        int i=0;
        for (String s:lList) {
            System.out.println(i+" :"+s);
            i++;
        }
    }
}
