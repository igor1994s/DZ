package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task9 {
    public static void main(String[] args) {
        int index;
        int sumA=0;
        int sumB=0;
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Введите количество элементов массива: ");
        index=sc.nextInt();
        if(index<=0){
            System.out.println("Введите положительное число!");
        }else {
            int[] a=new int[index];
            for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(15);
                System.out.print(a[i]+" ");
            }
            for (int i = 0; i < index/2; i++) {
                sumA+=a[i];
            }
            for (int i = (index/2)+1; i < index; i++) {
                sumB+=a[i];
            }
            System.out.println();
            if(sumA>sumB){
                System.out.println("Сумма элементов первой половины больше суммы элементов второй");
            }else {
                System.out.println("Сумма элементов второй половины больше суммы элементов первой");
            }
        }
    }
}
