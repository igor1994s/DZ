package by.teachmeskills.lessen10.task1;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws MyCarException{
        Random r = new Random();
        if (r.nextInt(21) % 2 == 0) {
            throw new MyCarException(model);
        } else {
            System.out.println("Автомобиль марки " + model + " завелся. ");
        }
    }
}
