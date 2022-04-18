package by.teachmeskills.lessen6_7_8OOP.clothes;

public class Skirt extends Clothes implements WomanClothes{

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public Skirt() {
    }
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public String dressAWoman() {
        return "Женщина одевает юбку. "+toString();
    }
}
