package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int diag1 = 1;
        int diag2 = 1;
        String str;
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
            int j = i;
            diag1 *= a[i][j];
        }
        for (int i = 0; i < a.length; i++) {
            int j = a.length - 1 - i;
            diag2 *= a[i][j];
        }

        if (diag1 > diag2) {
            System.out.println("Произведение элементов главной диагонали больше. ");
        } else if (diag1 < diag2) {
            System.out.println("Произведение элементов побочной диагонали больше. ");
        } else {
            System.out.println("Произведение элементов главной и побочной диагоналей равны. ");
        }

    }
}

