package by.teachmeskills.lessen12.tregulovTask;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeTest implements FilterEmployee{
    public static void printEmployee(Employee emp){
        System.out.printf("%s работает в департаменте %s. ЗП-%.2f\n",emp.getName(),emp.getDepartment(),emp.getSalary());
    }

    public static Employee filtrEmployee(ArrayList<Employee> aL,FilterEmployee fE) {
        for (Employee emp:aL) {
            if (fE.filtr(emp)){
                printEmployee(emp);
            }
        }
        return null;
    }

    @Override
    public boolean filtr(Employee emp) {
        return emp.getSalary()<700;
    }
}
