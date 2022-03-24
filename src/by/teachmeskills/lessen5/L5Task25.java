package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int sum = 0;
        int temp;

        System.out.println("Задайте размерность двухмерного массива: ");
        index = sc.nextInt();
        int a[][] = new int[index][index];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = r.nextInt(50);
            }
        }
        System.out.println("Данный массив: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }

        }
        System.out.println("Транспонированный массив: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

