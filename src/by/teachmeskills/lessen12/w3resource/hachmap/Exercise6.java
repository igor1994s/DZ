package by.teachmeskills.lessen12.w3resource.hachmap;

import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Blue");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Yellow");
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        System.out.println(hashMap2);
        hashMap2=(HashMap)hashMap1.clone();
        System.out.println(hashMap2);
        hashMap1.put(6,"Green");
        System.out.println(hashMap2);
    }
}
