package by.teachmeskills.lessen6OOP.person;

public class PersonApp {
    public static void main(String[] args) {
        Person maksim=new Person();
        maksim.setFullName("Maksim");
        maksim.setAge(28);
        Person vlad =new Person("Vlad",24);
        maksim.move();
        vlad.talk();
        System.out.println(vlad);
    }
}
