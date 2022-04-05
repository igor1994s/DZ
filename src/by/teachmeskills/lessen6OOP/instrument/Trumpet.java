package by.teachmeskills.lessen6OOP.instrument;

public class Trumpet implements Instrument{
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public Trumpet() {
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром "+diameter+" мм!");
    }
}
