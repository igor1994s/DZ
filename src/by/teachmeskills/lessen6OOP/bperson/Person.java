package by.teachmeskills.lessen6OOP.bperson;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }
    public Person(){
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    void move(){
        System.out.println(this.fullName+", которому "+this.age+" лет говорит.");
    }
    void talk(){
        System.out.println(this.fullName+", которому "+this.age+" лет говорит.");
    }
}
