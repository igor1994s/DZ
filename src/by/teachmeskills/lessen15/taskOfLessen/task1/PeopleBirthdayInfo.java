package by.teachmeskills.lessen15.taskOfLessen.task1;

import java.time.LocalDate;

public final class PeopleBirthdayInfo {
    public  static boolean isLeapYear(int age){
        return LocalDate.now().minusYears(age).isLeapYear();
    }
}
