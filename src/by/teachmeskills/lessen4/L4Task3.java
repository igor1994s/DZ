package by.teachmeskills.lessen4;

public class L4Task3 {
    public static void main(String[] args) {
        int a=1;
        int summa=a;
        while (a<256){
            a*=2;
            summa+=a;
        }
        System.out.println(a);
        System.out.println("Сумма чисел он 1+2+4+8+...+256 равно: "+summa);
    }
}
