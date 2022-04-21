package by.teachmeskills.lessen6_7_8OOP.car.com.company.professions;

public class Person {
    private  int age;
    private String fullName;

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
