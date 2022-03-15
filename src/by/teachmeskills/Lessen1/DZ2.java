package by.teachmeskills.Lessen1;

public class DZ2 {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int c=5;

        if (a<=0|b<=0|c<=0){
            System.out.println("Задайте положительные числа");
        }
        else if((a+b)>c&(b+c)>a&(c+a)>b){
            System.out.println("Треугольник с данными сторонами возможен");
        }
        else {
            System.out.println("Треугольник с данными сторонами НЕвозможен");
        }
    }

}
