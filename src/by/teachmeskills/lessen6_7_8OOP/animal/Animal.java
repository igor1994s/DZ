package by.teachmeskills.lessen6_7_8OOP.animal;

public class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public Animal() {
    }

    public void makeNoise(){
        System.out.println("Животное шумит. ");
    }
    public void eat(){
        System.out.println("Животное ест. ");
    }
    public void sleep(){
        System.out.println("Животноке спит. ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
