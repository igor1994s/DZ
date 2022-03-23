package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L4Task11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r =new Random();
        int index;
        int itog=1;
        int count=0;
        System.out.println("Введите количество элементов масива: ");
        index=sc.nextInt();
        int a[] =new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(index);
            System.out.print(a[i]+" ");
            if(a[i]%3==0&&a[i]!=0){
               itog*=a[i];
               count++;

            }
        }
        System.out.println();
        if(count>0){
            System.out.println("Произведение элементов массива кратных 3 равно: "+itog);
        }else {
            System.out.println("Элементов картных 3 в массиве не обнаружено!");
        }
    }
}
