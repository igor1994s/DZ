package by.teachmeskills.lessen5;

import java.util.Random;

public class L5Task5 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int sumA = 0;
        int sumB = 0;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            a[i] = random.nextInt(15);
            sumA += a[i];
            b[i] = random.nextInt(15);
            sumB += b[i];
        }
        System.out.print("1-й массив: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(+a[i] + " ");
        }
        System.out.println();
        System.out.print("2-й массив: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(+b[i] + " ");
        }
        System.out.println();
        if (sumA > sumB) {
            System.out.println("Среднее арифметическое элементов 1-го массива больше чем среднее арифметическое элементов 2-го массива. ");
        } else if(sumB>sumA) {
            System.out.println("Среднее арифметическое элементов 2-го массива больше чем среднее арифметическое элементов 1-го массива. ");
        }else{
            System.out.println("Средние арифметические элементов 1-го и 2-го массивов равны. ");
        }
    }
}
