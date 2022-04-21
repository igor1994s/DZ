package by.teachmeskills.lessen6_7_8OOP.clothes;

public abstract class Clothes {

    private Size size;
    private double price;
    private String color;

    public Clothes() {
    }

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String dressAWoman() {
        return  null;
    }

    public String dressAMan() {
        return null;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return size.toString()+"Цена: "+price+", цвет: "+color;
    }
}
