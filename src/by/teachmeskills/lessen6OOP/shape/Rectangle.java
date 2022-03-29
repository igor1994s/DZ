package by.teachmeskills.lessen6OOP.shape;

public class Rectangle extends Shape{
    private int a;
    private int b;

    @Override
    public void draw() {
        System.out.println("Rectangle: "+this.a+" "+this.b+" "+this.getColor());
    }
    public Rectangle(String color, int a, int b){
        super(color);
        this.a=a;
        this.b=b;
    }
    public Rectangle(){

    }
    public int getA(){
        return a;
    }
    public void setA(){
        this.a=a;
    }
    public int getB(){
        return b;
    }
    public void setB(){
        this.b=b;
    }
}
