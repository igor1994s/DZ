package by.teachmeskills.Lessen1;

public class DZ1 {
    public static void main(String[] args) {
        int a = 100;
        int i = 1;
        String znak=null;
        if (a!=0){
            if (a < 0) {
                znak = "отрицательное";
                a = -a;
            }
            else {
                znak = "положительное";
            }
            while (a / 10 > 0) {
                a = a / 10;
                i++;
            }
            System.out.println("Число заданное в условии " + znak + " " + i + "-значное");

        }
        else {
            System.out.println("Число заданное в условии равно 0");
        }



        }
    }
