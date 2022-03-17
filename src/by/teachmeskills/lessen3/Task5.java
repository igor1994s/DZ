package by.teachmeskills.lessen3;

public class Task5 {
    public static void main(String[] args) {
        int a = -5;
        int b = 25;
        int c = -34;
        int plus = 0;
        int minus = 0;
        plus=a>=0?++plus:plus;
        plus=b>=0?++plus:plus;
        plus=c>=0?++plus:plus;
        minus=a<0?++minus:minus;
        minus=b<0?++minus:minus;
        minus=c<0?++minus:minus;
        /*if (a >= 0) {
            plus++;
        } else {
            minus++;
        }
        if (b >= 0) {
            plus++;
        } else {
            minus++;
        }
        if (c>= 0) {
            plus++;
        } else {
            minus++;
        }*/
        System.out.println("Количество положительных чисел равно: " + plus);
        System.out.println("Количество отрицательных чисел равно: " + minus);
    }
}
