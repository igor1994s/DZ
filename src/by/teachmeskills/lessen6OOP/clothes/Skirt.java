package by.teachmeskills.lessen6OOP.clothes;

import java.sql.SQLOutput;

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
