package by.teachmeskills.lessen6OOP.shape;

public class ShapeApp {
    public static void main(String[] args) {
        Shape circle1=new Circle("Red",1,2);
        Shape circle2=new Circle("White",3,4);
        Shape rectangle3=new Rectangle("Black",5,6);
        Shape rectangle4=new Rectangle("Yellow",7,8);

        Shape[] shape={circle1,circle2,rectangle3,rectangle4};

        for (Shape i:shape) {
            i.draw();
        }
    }

}
