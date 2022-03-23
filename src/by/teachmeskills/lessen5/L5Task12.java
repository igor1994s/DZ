package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r =new Random();
        int index;
        double itog=0;
        System.out.println("Введите количество элементов масива: ");
        index=sc.nextInt();
        int a[] =new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(index);
            System.out.print(a[i]+" ");
            if(i%2!=0){
            itog+=(double)a[i]/(index/2);
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое элементов с нечетным индексом равно: "+itog);
    }
}
