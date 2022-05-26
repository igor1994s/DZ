package by.teachmeskills.lessen12.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Student {
    private static int ID = 0;

    private int id;
    private String surname;
    private int age;
    private String faculty;
    private int course;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Student() {

    }

    public static ArrayList<Student> createStudents(int value) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            students.add(new Student(false));
        }
        return students;
    }

    public Student(boolean newStudent) {
        if (newStudent) {
            this.id = ++ID;
            setSurname();
            setAge();
            setFaculty();
            setCourse();
        } else {
            id = ++ID;
            surname = randomSurname();
            age = randomAge();
            faculty = randomFaculty();
            course = randomCourse();
        }
    }

    private String randomSurname() {
        StringBuilder sb = new StringBuilder();
        String[] surname;
        int index;
        try (FileInputStream fis = new FileInputStream(".\\src\\by\\teachmeskills\\lessen12\\task1\\Surname.txt")) {
            int a;
            while ((a = fis.read()) != -1) {
                sb.append((char) a);
            }
            String text = new String(sb);
            surname = text.split("\r\n");
            index = random.nextInt(surname.length);
            return surname[index];
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String randomFaculty() {
        StringBuilder sb = new StringBuilder();
        String[] faculty;
        int index;
        try (FileInputStream fis = new FileInputStream(".\\src\\by\\teachmeskills\\lessen12\\task1\\Faculty.txt")) {
            int a;
            while ((a = fis.read()) != -1) {
                sb.append((char) a);
            }
            String text = new String(sb);
            faculty = text.split("\r\n");
            index = random.nextInt(faculty.length);
            return faculty[index];
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private int randomAge() {
        return random.nextInt(34) + 17;
    }

    private int randomCourse() {
        return random.nextInt(5) + 1;
    }

    public static void createStudent() {
        new Student();
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSurname() {
        System.out.println("Введите фамилию студента: ");
        this.surname = scanner.nextLine();
        System.out.printf("Фамилия студента %s успешно заполнена. \n", this.surname);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge() {
        System.out.println("Введите возраст студента: ");
        int age = scanner.nextInt();
        if (age > 0 && age < 100) {
            this.age = age;
            System.out.printf("Возраст студента %d успешно заполнен. \n", this.age);
        } else {
            System.out.println("Ошибка задания возраста. Попробуйте еще раз: ");
            setAge();
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setFaculty() {
        System.out.println("Введите факультет студента: ");
        scanner.nextLine();
        this.faculty = scanner.nextLine();
        System.out.printf("Факультет студента %s успешно заполнен. \n", this.faculty);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setCourse() {
        System.out.println("Введите курс студента: ");
        int course = scanner.nextInt();
        if (course > 0 && course <=5) {
            this.course = course;
            System.out.printf("Курс студента %d успешно заполнен. \n", this.course);
        } else {
            System.out.println("Ошибка задания курса. Попробуйте еще раз: ");
            setCourse();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", name='" + surname + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}' + "\n";
    }
}
