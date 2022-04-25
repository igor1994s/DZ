package by.teachmeskills.lessen9.task_6;

public class Report {
    public static void generateReport(Employee[] emp){
        StringBuilder sb=new StringBuilder();
        for (Employee i:emp) {
            System.out.printf("Заработная плата работника %-20s составляет %7.2f $\n",i.getFullname(),i.getSalary());
        }
    }
}
