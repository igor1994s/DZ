package by.teachmeskills.lessen12.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void menuStart() {

        Scanner scanner = new Scanner(System.in);
        int number;
        ArrayList<Student> students=Student.createStudents(10);
        printStudents(students);
        while (true) {

            System.out.println("========================================================================================");
            System.out.println("1 - добавление нового студента в список");
            System.out.println("2 - удаление студента из списка по id");
            System.out.println("3 - редактирование студента по id");
            System.out.println("4 - получить всех студентов в отсортированном виде по имени и возрасту");
            System.out.println("5 - получить все уникальные факультеты и имена студентов и их возраст на этом факультете");
            System.out.println("6 - выход");
            System.out.println("========================================================================================");
            System.out.println("Сделайте выбор: ");
            number = scanner.nextInt();
            if (number >= 1 || number <= 6) {
                switch (number) {
                    case 1:
                        System.out.println("Добавление нового студента: ");
                        students.add(new Student(true)) ;
                        printStudents(students);
                        //addNewStudend;
                        break;
                    case 2:
                        System.out.println("Удаление студента: \nВведите ID студента для удаления :");
                        int id=scanner.nextInt();
                        String surname=(students.get(id)).getSurname();
                        int index=id-1;
                        students.remove(index);
                        System.out.printf("Студент с ID=%d и фамилией %s удален из списка.",id, surname);
                        printStudents(students);
                        //deleteStudent;
                        break;
                    case 3:
                        //editStudent;
                        break;
                    case 4:
                        //sortStudentNameAndAge;
                        break;
                    case 5:
                        //editStudent;
                        break;
                    case 6:
                        System.out.println("Конец.");
                        System.exit(0);
                }
            }else {
                System.out.println("Неправильный выбор. Попробуйте еще раз :)");
            }
        }

    }

    public static void printStudents(ArrayList<Student> students) {
        for (Student st:students) {
            System.out.printf("%-5d%15s%4d %-15s%3d\n", st.getId(), st.getSurname(), st.getAge(), st.getFaculty(), st.getCourse());
        }
    }
}

