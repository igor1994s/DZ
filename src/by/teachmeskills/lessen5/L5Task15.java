package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int c;
        int min;

        System.out.println("Введите количество элементов масива: ");
        index = sc.nextInt();

        int a[] = new int[index];
        System.out.println("Исходный массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("\"Сжатый\" массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            if(i<=(a.length-1)/2) {
                a[i] = a[2 * i];
                System.out.print(a[i] + " ");
            }else{
                a[i] = 0;
                System.out.print(a[i] + " ");
            }
        }
    }
}
