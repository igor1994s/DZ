package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int element;
        int count=0;

        System.out.println("Введите количество элементов масива: ");
        index = sc.nextInt();
        System.out.println("Введите число для сравнения: ");
        element = sc.nextInt();

        int a[] = new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(9);
            System.out.print(a[i] + " ");
            if(a[i]==element){
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество повторений равно: "+count);
    }
}
