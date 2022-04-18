package by.teachmeskills.lessen6OOP.clothes;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    public Tie() {
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public String dressAMan() {
        return "Мужчиина одевает галстук. "+toString();
    }
}
