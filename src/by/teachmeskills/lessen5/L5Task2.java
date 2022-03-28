package by.teachmeskills.lessen5;

public class L5Task2 {
    public static void main(String[] args) {
        int a[] = new int[((99 - 1) / 2) + 1];
        System.out.println("Вывод массива нечетных чисел а прямом порядке :");
        for (int i = 1; i <= 99; i += 2) {
            a[(i / 2)] = i;
            System.out.print(a[(i / 2)] + " ");
        }
        System.out.println();
        System.out.println("Вывод массива нечетных чисел а обратном порядке :");

        for (int i = 99; i >= 1; i -= 2) {
            a[(i / 2)] = i;
            System.out.print(a[(i / 2)] + " ");
        }
    }
}
