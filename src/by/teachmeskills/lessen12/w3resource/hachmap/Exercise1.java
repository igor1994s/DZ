package by.teachmeskills.lessen12.w3resource.hachmap;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap=new HashMap<>();
        hashMap.put(1,"Red");
        hashMap.put(2,"Blue");
        hashMap.put(3,"Black");
        hashMap.put(4,"White");
        hashMap.put(5,"Yellow");
        for (Map.Entry<Integer,String> hM:hashMap.entrySet()) {
            System.out.printf("%3d %s \n",hM.getKey(), hM.getValue());
        }
    }
}
