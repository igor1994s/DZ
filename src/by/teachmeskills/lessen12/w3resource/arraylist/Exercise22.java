package by.teachmeskills.lessen12.w3resource.arraylist;

import java.util.ArrayList;
//ВЫВОД ЭЛЕМЕНТОВ КООЛЛЕКЦИИ КАЖДЫЙ С НОВОЙ СТРОКИ.
public class Exercise22 {
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        System.out.println(listString);

        for (int i=0;i<listString.size();i++){
            System.out.println(listString.get(i));
        }
    }
}
