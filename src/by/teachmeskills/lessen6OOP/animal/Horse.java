package by.teachmeskills.lessen6OOP.animal;

public class Horse extends Animal {
    private String maneColor;
    private int valueHorseshoe;

    public Horse(String name, String food, String location, String maneColor, int valueHorseshoe) {
        super(name, food, location);
        this.maneColor = maneColor;
        this.valueHorseshoe = valueHorseshoe;
    }

    public Horse() {
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    public int getValueHorseshoe() {
        return valueHorseshoe;
    }

    public void setValueHorseshoe(int valueHorseshoe) {
        this.valueHorseshoe = valueHorseshoe;
    }

    public void makeNoise(){
        System.out.println("Лошадь шумит. ");
    }
    public void eat(){
        System.out.println("Лошадь ест. ");
    }
    @Override
    public String toString() {
        return "Лошадь ";
    }
}
