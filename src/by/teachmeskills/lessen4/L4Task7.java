package by.teachmeskills.lessen4;

import java.util.Scanner;

public class L4Task7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 99;
        int summa=0;
        for (int i = a; i <= b; i += 2) {
            summa+=i;
        }
        System.out.println("Сумма чнечетных чисел от "+a+" до "+b+" равна: "+summa);
    }
}
