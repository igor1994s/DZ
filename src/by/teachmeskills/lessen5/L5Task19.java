package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int min;


        System.out.println("Введите количество элементов масива: ");
        index = sc.nextInt();

        int a[] = new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(99);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        min=a[0];
        for (int i = 0; i < a.length; i+=2) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Наименьший элемент массива из элементов с четным индексом равен: "+min);
    }
}
