package by.teachmeskills.lessen5;

import java.util.Random;

public class L5Task6 {
    public static void main(String[] args) {
        Random r =new Random();
        int [] a=new int[4];
        int countPlus=0;
        int countMinus=0;
        System.out.print("Массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i]= r.nextInt(10);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==a[i+1]+1){
                countPlus++;
            }else if(a[i]==a[i+1]-1){
                countMinus++;
            }

        }
        if(countPlus==a.length-1||countMinus==a.length-1){
            System.out.println(" Массив является строго возвращающей последовательностью ");
        }else {
            System.out.println(" Массив не является строго возвращающей последовательностью ");
        }
    }

}
