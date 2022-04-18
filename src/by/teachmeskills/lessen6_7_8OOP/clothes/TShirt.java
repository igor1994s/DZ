package by.teachmeskills.lessen6_7_8OOP.clothes;

public class TShirt extends Clothes implements ManClothes,WomanClothes{

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public TShirt() {
    }

    @Override
    public String dressAMan() {
        return  "Женщина одевает футболку. "+toString();
    }

    @Override
    public String dressAWoman() {
        return  "Женщина одевает футболку. "+toString();
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
