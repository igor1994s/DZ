package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int c;
        double itog = 0;
        int count=0;

        System.out.println("Введите количество элементов масива: ");
        index = sc.nextInt();
        System.out.println("Введите сичло С: ");
        c = sc.nextInt();

        int a[] = new int[index];
        System.out.println("Массив элементов: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(index);
            System.out.print(a[i] + " ");
            if(a[i]>c){
                itog+=a[i];
                count++;
            }
        }
        System.out.println();
        if(count>0){
            System.out.println("Среднее арифметическое элементов больше С равно: "+itog/count);
        }else{
            System.out.println("В данном массиве элементов больше С нет!");
        }


    }
}
