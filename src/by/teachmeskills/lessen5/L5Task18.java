package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int temp;

        System.out.println("Введите количество элементов масива: ");
        index = sc.nextInt();

        int a[] = new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортированный в порядке убывания массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Второй по величине элемент массива: "+a[1]);
    }
}
