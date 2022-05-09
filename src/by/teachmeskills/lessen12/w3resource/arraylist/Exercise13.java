package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
import java.util.List;
//СРАВНЕНИЕ ДВУХ КОЛЛЕКЦИЙ.
public class Exercise13 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        
        List<String> listString2=new ArrayList<>();
        listString2.add("Red");
        listString2.add("Green");
        listString2.add("Orange");
        listString2.add("Black");
        System.out.println(listString);
        System.out.println(listString2);

        List<String> itog=new ArrayList<>();
        for (String s:listString) {
            itog.add(listString2.contains(s)?"Yes":"No"); //СРАВНИВАЕТ ЕСТЬ ЛИ ЭЛЕМЕНТЫ ПЕРВОЙ КОЛЛЕКЦИИ ВО ВТОРОЙ.
        }
        System.out.println(itog);
    }
}
