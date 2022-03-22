package by.teachmeskills.lessen5;

import java.util.Random;

public class L5Task7 {
    public static void main(String[] args) {
        Random r =new Random();
        int a[]=new int[12];
        int max=0;
        int index=0;
        System.out.println("Массив: ");
        for (int i = 0; i < a.length; i++) {
            a[i]= r.nextInt(15);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < a.length-1; i++) {
                if(a[i]>a[i+1]&&a[i]>max){
                    max=a[i];
                    index=i;
                }else if(a[i]<a[i+1]&&a[i+1]>max){
                    max=a[i+1];
                    index=i+1;
                }
        }
        System.out.println("Максимальный элемент массива: "+a[index]+" с порядковым номером "+(index+1));
    }
}
