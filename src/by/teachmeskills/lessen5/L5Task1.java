package by.teachmeskills.lessen5;

public class L5Task1 {
    public static void main(String[] args) {
        int [] a=new int[10];
        System.out.println("Вывод массива в строку:");
        for (int i = 2; i <=20 ; i+=2) {
            a[(i/2)-1]=i;
            System.out.print(a[(i/2)-1]+" ");
        }
        System.out.println();
        System.out.println("Вывод массива в столбец");
        for (int i = 2; i <=20 ; i+=2) {
            a[(i/2)-1]=i;
            System.out.println(a[(i/2)-1]);
        }
    }
}
