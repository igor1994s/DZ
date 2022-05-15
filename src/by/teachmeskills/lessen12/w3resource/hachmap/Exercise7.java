package by.teachmeskills.lessen12.w3resource.hachmap;

import java.util.Collections;
import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "Red");
        hashMap1.put(2, "Blue");
        hashMap1.put(3, "Black");
        hashMap1.put(4, "White");
        hashMap1.put(5, "Yellow");
        System.out.println(hashMap1.containsKey(3));
    }
}
