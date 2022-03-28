package by.teachmeskills.lessen5;

import java.util.Scanner;

public class L5Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Игра началась!");
        System.out.println("Координаты 1й точки: (1:1)! ");
        String[][] pole = new String[3][3];
        int count = 0;
        int x;
        int y;
        int countXi = 0;
        int countXj = 0;
        int count0i = 0;
        int count0j = 0;
        boolean pobedaX;
        boolean pobeda0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pole[i][j] = " # ";
                System.out.print(pole[i][j]);
            }
            System.out.println();
        }

        while (count < 9) {
            boolean hod1 = false;
            boolean hod2 = false;

            //ПЕРВЫЙ ИГРОК

            while (hod1 == false) {
                System.out.println("1й игрок, введите координаты следующей точки (x): ");
                x = sc.nextInt();
                System.out.println("1й игрок, введите координаты этой точки (y): ");
                y = sc.nextInt();
                System.out.println();

                if (x > 0 && x < 4 && y > 0 && y < 4) {

                    if (pole[x - 1][y - 1] == " # ") {
                        pole[x - 1][y - 1] = " x ";
                        hod1 = true;
                        count++;

                        //ВЫВОД ПОЛЯ НА ЭКРАН ПОСЛЕ ХОДА ПЕРВОГО ИГРОКА
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(pole[i][j]);
                            }
                            System.out.println();
                        }

                        //ПРОВЕРКА ПОБЕДЫ ПО ЛИНИЯМ
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {
                                while (pole[i][j] == " x ") {
                                    countXi++;
                                    break;
                                }
                                while (pole[j][i] == " x ") {
                                    countXj++;
                                    break;
                                }
                            }
                            if (countXi == 3 || countXj == 3) {
                                System.out.println("1й игрок победил! ");
                                System.exit(0);
                            }
                            countXi = 0;
                            countXj = 0;
                        }
                        //ПРОВЕРКА ПОБЕДЫ ПО ДИАГОНАЛЯМ
                        for (int i = 0, j = 0; i < 3; i++) {
                            j = i;
                            while (pole[i][j] == " x ") {
                                countXi++;
                                break;
                            }
                        }
                        for (int i = 0, j = 2; i < 3; i++, j--) {
                            while (pole[i][j] == " x ") {
                                countXj++;
                                break;
                            }
                        }
                        if (countXi == 3 || countXj == 3) {
                            System.out.println("1й игрок победил! ");
                            System.exit(0);
                        }
                        countXi = 0;
                        countXj = 0;

                    } else {
                        System.out.println("Введите данные пустой клетки! ");
                    }
                } else {
                    System.out.println("Введите данные пустой клетки! ");
                }
                System.out.println();
            }


            //ВТОРОЙ ИГРОК

            while (hod2 == false) {
                System.out.println("2й игрок, введите координаты следующей точки (x): ");
                x = sc.nextInt();
                System.out.println("2й игрок, введите координаты этой точки (y): ");
                y = sc.nextInt();
                System.out.println();
                if (x > 0 && x < 4 && y > 0 && y < 4) {

                    if (pole[x - 1][y - 1] == " # ") {
                        pole[x - 1][y - 1] = " 0 ";
                        hod2 = true;
                        count++;

                        //ВЫВОД ПОЛЯ НА ЭКРАН ПОСЛЕ ХОДА ВТОРОГО ИГРОКА

                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(pole[i][j]);

                            }
                            System.out.println();
                        }
                        for (int i = 0; i < 3; i++) {

                            for (int j = 0; j < 3; j++) {
                                while (pole[i][j] == " 0 ") {
                                    count0i++;
                                    break;
                                }
                                while (pole[j][i] == " 0 ") {
                                    count0j++;
                                    break;
                                }
                            }
                            if (count0i == 3 || count0j == 3) {
                                System.out.println("2й игрок победил! ");
                                System.exit(0);
                            }
                            count0i = 0;
                            count0j = 0;
                        }
                        //ПРОВЕРКА ПОБЕДЫ ПО ДИАГОНАЛЯМ
                        for (int i = 0, j = 0; i < 3; i++) {
                            j = i;
                            while (pole[i][j] == " 0 ") {
                                count0i++;
                                break;
                            }
                        }
                        for (int i = 0, j = 2; i < 3; i++, j--) {
                            while (pole[i][j] == " 0 ") {
                                count0j++;
                                break;
                            }
                        }
                        if (count0i == 3 || count0j == 3) {
                            System.out.println("2й игрок победил! ");
                            System.exit(0);
                        }
                        count0i = 0;
                        count0j = 0;
                    } else {
                        System.out.println("Введите данные пустой клетки! ");
                    }
                } else {
                    System.out.println("Введите данные пустой клетки! ");
                }
                System.out.println();
            }
        }
    }
}


