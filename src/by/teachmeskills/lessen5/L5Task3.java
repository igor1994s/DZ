package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Введите количество элементов массива :");
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов в массиве равно: " + count);
    }
}
