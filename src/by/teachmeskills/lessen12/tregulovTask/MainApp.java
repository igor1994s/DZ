package by.teachmeskills.lessen12.tregulovTask;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Igor","SRZAI",620));
        employees.add(new Employee("Ivan","SRZAI",580));
        employees.add(new Employee("Petr","SPS",750));
        employees.add(new Employee("Sergey","SAUP",750));
        EmployeeTest testing=new EmployeeTest();
        EmployeeTest.filtrEmployee(employees,emp->emp.getSalary()<600);
        System.out.println("-----------------------------------------------------------------");
        EmployeeTest.filtrEmployee(employees,(Employee emp)->{return emp.getName().equals(" ");});
        System.out.println("-----------------------------------------------------------------");
        EmployeeTest.filtrEmployee(employees,(Employee emp)->{return emp.getDepartment().equals("SPS");});
        System.out.println("-----------------------------------------------------------------");
    }
}
