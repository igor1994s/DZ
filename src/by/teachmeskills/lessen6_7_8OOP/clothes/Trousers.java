package by.teachmeskills.lessen6_7_8OOP.clothes;

public class Trousers extends Clothes implements WomanClothes,ManClothes{

    public Trousers(Size size, double price, String color) {
        super(size, price, color);
    }

    public Trousers() {
    }

    @Override
    public String dressAMan() {
        return  "Мужчина одевает штаны. "+toString();
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public String dressAWoman() {
       return  "Женщина одевает штаны. "+toString();
    }
}
