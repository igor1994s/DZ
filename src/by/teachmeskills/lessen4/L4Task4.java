package by.teachmeskills.lessen4;

import java.util.Scanner;

public class L4Task4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число A: ");
        double a=scanner.nextDouble();
        System.out.println("Введите число B: ");
        double b=scanner.nextDouble();
        System.out.println("A*B равняется :"+a/(1/b));
    }
}
