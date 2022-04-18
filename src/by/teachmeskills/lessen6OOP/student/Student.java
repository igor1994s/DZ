package by.teachmeskills.lessen6OOP.student;

public class Student {
    private String firstName;
    private String lastName;
    private  int group;
    private double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
        this.averageMark=averageMark;
    }

    public Student() {
    }

    public double getScholarship(){
        if(averageMark==5.0){
            return 100.0;
        }else   {
            return 80.0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}

