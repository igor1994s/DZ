package by.teachmeskills.lessen13.examxlouds;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {
        LocalDate hB=LocalDate.of(1994,8,26);
        System.out.println("День недели моего рождения: "+hB.getDayOfWeek());
        System.out.println("День моего рождения в году: "+hB.getDayOfYear());
        System.out.println(hB.getMonth());
        System.out.println(hB.getYear());
        LocalDate nT=LocalDate.now();
        System.out.println(hB.isAfter(nT));
        System.out.println(hB.isBefore(nT));
    }
}
