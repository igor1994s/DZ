package by.teachmeskills.lessen4;

public class L4Task8 {
    public static void main(String[] args) {
        System.out.println("1) ");
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= 4; j++) {
                if (j >= i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("2) ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j >= i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
