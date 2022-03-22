package by.teachmeskills.lessen4;

public class L4Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i++) {
            if (i==1){
                System.out.println(i+" дюйм = "+i*2.54+" см");
            }else if(1<i&&i<5) {
                System.out.println(i + " дюйма = " + i * 2.54 + " см");
            }
            else{
                System.out.println(i+" дюймов = "+i*2.54+" см");
                }
        }
    }
}
