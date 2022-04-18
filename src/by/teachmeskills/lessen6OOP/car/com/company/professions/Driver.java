package by.teachmeskills.lessen6OOP.car.com.company.professions;

public class Driver extends Person {
    private  int experience;

    public Driver(String fullName,int age, int experience) {
        super(fullName,age);
        this.experience = experience;
    }

    public Driver() {
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
