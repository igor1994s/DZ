package by.teachmeskills.lessen6OOP.car;

import by.teachmeskills.lessen6OOP.car.com.company.details.Engine;
import by.teachmeskills.lessen6OOP.car.com.company.professions.Driver;
import by.teachmeskills.lessen6OOP.car.com.company.professions.Person;
import by.teachmeskills.lessen6OOP.car.com.company.vehicles.Car;

public class CarApp {
    public static void main(String[] args) {
        Driver driver1 =new Driver("Иванов Иван",41, 20);
        Driver driver2 =new Driver("Петров Петр",28, 7);
        Engine v6 =new Engine(240,"GM");
        Engine r5=new Engine(140, "Audi");
        Car mersedes =new Car("Mersedes","E",1850,driver1,v6);
        Car audi =new Car("Audi","D",2100,driver2,r5);

        mersedes.printInfo();
        audi.printInfo();
        System.out.println("Мерседес в пути:");
        mersedes.start();
        mersedes.turnLeft();
        mersedes.stop();
        System.out.println("Aуди в пути: ");
        audi.start();
        audi.turnRight();
        audi.stop();
    }
}
