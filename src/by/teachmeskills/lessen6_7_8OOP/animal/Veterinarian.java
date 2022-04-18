package by.teachmeskills.lessen6_7_8OOP.animal;

public class Veterinarian {

        public static void treatAnimal (Animal animal){
            System.out.println(animal.toString() + "который обитает в " + animal.getLocation() + " и прешел на прием обычно ест " + animal.getFood());
        }
    }

