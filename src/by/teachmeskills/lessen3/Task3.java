package by.teachmeskills.lessen3;

public class Task3 {
    public static void main(String[] args) {
        int chislo=15;
        if (chislo>0){
            chislo+=1;
        }else if(chislo<0){
            chislo-=2;
        }else {
            chislo=10;
        }
        System.out.println("Выводим полученное число: "+chislo);
    }
}
