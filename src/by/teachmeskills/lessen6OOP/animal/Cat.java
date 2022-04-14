package by.teachmeskills.lessen6OOP.animal;

public class Cat extends Animal{
    private String catBreed;

    public Cat(String name, String food, String location, String catBreed) {
        super(name, food, location);
        this.catBreed = catBreed;
    }


    public Cat() {
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public void makeNoise(){
        System.out.println("Кот шумит. ");
    }
    public void eat(){
        System.out.println("Кот ест. ");
    }

    @Override
    public String toString() {
        return "Кот ";
    }
}
