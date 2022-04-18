package by.teachmeskills.lessen6OOP.shape;

public class Circle extends Shape{
    private int a;
    private int b;

    @Override
    public void draw() {
        System.out.println("Circle: "+this.a+" "+this.b+" "+this.getColor());
    }
    public Circle(String color, int a, int b){
        super(color);
        this.a=a;
        this.b=b;
    }
    public Circle(){

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
