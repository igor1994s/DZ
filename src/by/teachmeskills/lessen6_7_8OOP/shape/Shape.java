package by.teachmeskills.lessen6_7_8OOP.shape;

public abstract class Shape {
    private String color;

    public abstract void draw();

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
