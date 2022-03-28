package by.teachmeskills.lessen5;

import java.util.Random;
import java.util.Scanner;

public class L5Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int index;
        int count = 0;
        while (true) {
            System.out.println("Введите целое число больше 3: ");
            index = sc.nextInt();
            if (index < 3) {
                System.out.println("Неверное число!");
            } else {
                break;
            }
        }
        int a[]=new int[index];
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt(index);
            if(a[i]%2==0){
                count++;
            }
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int b[]=new int[count];
        for (int i = 0, j=0; i < a.length; i++) {
            if(a[i]%2==0){
                b[j]=a[i];
                System.out.print(b[j]+" ");
                j++;
            }

        }
    }
}
