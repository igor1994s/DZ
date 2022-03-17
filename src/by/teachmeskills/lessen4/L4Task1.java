package by.teachmeskills.lessen4;

public class L4Task1 {
    public static void main(String[] args) {

        double l1=10;
        double dlina=l1;
        for (int i = 0; i < 6; i++) {
             l1=l1*1.1;
            dlina=dlina+l1;
        }
        int itog=(int)dlina;
        System.out.println("За 7 дней спортсмен пробежит: "+itog+" км.");
    }
}
