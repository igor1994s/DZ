package by.teachmeskills.lessen3;

public class Task7 {
    public static void main(String[] args) {
        int developer = 542;
        if (10 < developer % 100 && developer % 100 < 15) {
            System.out.println(developer + " программистов");
        } else {
            int ostatok = developer % 10;
            switch (ostatok) {
                case 1:
                    System.out.println(developer + " программист");
                    break;
                case 2, 3, 4:
                    System.out.println(developer + " программиста");
                    break;
                case 5, 6, 7, 8, 9, 0:
                    System.out.println(developer + " программистов");
                    break;
            }
        }
    }
}
