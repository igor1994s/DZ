package by.teachmeskills.lessen4;

public class L4Task6 {
    public static void main(String[] args) {
        int a=2;
        int b=155;
        System.out.print("Вывод четных чисел от "+a+" до "+b+" : ");
        for (int i = a; i <=b ; i=i+2) {
            if(i==b||i==b-1) {
                System.out.print(i + ". ");
            }else {
                System.out.print(i+", ");
            }
        }
    }
}
