package by.teachmeskills.lessen12.w3resource.hachmap;

import java.util.HashMap;

public class Exercise2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Blue");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Yellow");
        System.out.printf("Количество элементов в коллекции: %d",hashMap.size());
    }
}
