package by.teachmeskills.lessen6OOP.animal;

public class Dog extends Animal{
    private String dogBreed;

    public Dog(String name, String food, String location, String dogBreed) {
        super(name, food, location);
        this.dogBreed = dogBreed;
    }

    public Dog() {
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void makeNoise(){
        System.out.println("Собака шумит. ");
    }
    public void eat(){
        System.out.println("Собака ест. ");
    }
    @Override
    public String toString() {
        return "Собака ";
    }
}

