package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int max;
        int indexMax;
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
        max=a[0];
        indexMax=0;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]>max){
                max=a[i];
                indexMax=i;
            }
        }
        if(indexMax!=0){
            temp=a[0];
            a[indexMax]=temp;
            a[0]=max;

            System.out.println("Измененный массив элементов: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }else {
            System.out.println("Максимальный элемент и так стоит на 0-м месте!");
        }

    }
}
