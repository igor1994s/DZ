package by.teachmeskills.lessen6OOP.student;

public class StudentApp {
    public static void main(String[] args) {
        Aspirant st1=new Aspirant("Igor", "Sergeychuk",106221,4.8,"Energetika");
        Student st2=new Student("Vlad","Silin", 105211,5.0);
        Aspirant st3=new Aspirant("Ilia", "Trestyan",106221,5.0,"Automatic");
        Student st4=new Student("Vitalik","Ignatchik", 105211,4.5);

        Student[] potok=new Student[]{st1,st2,st3,st4};
        for(Student i:potok){
            System.out.println(i.getScholarship());
        }
    }

}
