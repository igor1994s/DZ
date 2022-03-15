package by.teachmeskills.Lessen1;

public class DZ1 {
    public static void main(String[] args) {
        int a =100;
        int i=1;
        String znak;
        if (a<0) {
            znak = "отрицательное";
            a = -a;
        }
            if(a>0){
                znak="положительное";
            }
            else {
                znak=" равно 0";
            }
        if(a%10>0){
        a=a/10;
        i++;
        }

        System.out.println("Число заданное в условии "+znak+" "+i+"-значное");

    }
}
