package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        boolean povtor=false;


        System.out.println("Введите количество элементов масива: ");
        index = sc.nextInt();

        int a[] = new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j]){
                    System.out.println("Не все элементы массива различны! ");
                    povtor=true;
                    break;
                    }
                }
            if(povtor){
                break;
                }
            if(i==a.length-2){
                System.out.println("Все элементы массива различны! ");
            }
        }
    }
}
