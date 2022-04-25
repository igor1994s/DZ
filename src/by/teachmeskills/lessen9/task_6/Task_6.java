package by.teachmeskills.lessen9.task_6;

//Создать класс Employee, у которого есть переменные класса - fullname, salary.
//        Создать массив содержащий несколько объектов этого типа.
//        Создать класс Report  со статическим методом generateReport, в котором выводится информация о зарплате всех сотрудников.
//        Используйте форматирование строк. Пусть salary будет выровнено по правому краю, десятичное значение имеет 2 знака после
//        запятой и можете добавить что-нибудь свое.

public class Task_6 {
    public static void main(String[] args) {
        Employee emp1=new Employee("Petrov Oleksey",1500);
        Employee emp2=new Employee("Silin Vladislav",750);
        Employee emp3=new Employee("Skok Andrey",1200);
        Employee emp4=new Employee("Rabcev Nikolay",1400);
        Employee emp5=new Employee("Ignatchik Vitaliy",820);
        Employee[] emp={emp1,emp2,emp3,emp4,emp5};
        Report.generateReport(emp);
    }
}
