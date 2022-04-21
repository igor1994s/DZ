package by.teachmeskills.lessen6_7_8OOP.student;

public class Aspirant extends  Student{
    private String scienceWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant() {
    }

    public double getScholarship(){
        if(this.getAverageMark()==5.0){
            return 200.0;
        }else   {
            return 180.0;
        }
    }
}
