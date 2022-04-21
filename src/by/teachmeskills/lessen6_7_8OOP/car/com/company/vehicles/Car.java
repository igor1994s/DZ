package by.teachmeskills.lessen6_7_8OOP.car.com.company.vehicles;


import by.teachmeskills.lessen6_7_8OOP.car.com.company.details.Engine;
import by.teachmeskills.lessen6_7_8OOP.car.com.company.professions.Driver;

public class Car {
    private String brand;
    private String classAuto;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String brand, String classAuto, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public void start() {
        System.out.println("Поехали! ");
    }

    public void stop() {
        System.out.println("Останавливаемся! ");
    }

    public void turnRight() {
        System.out.println("Поварот направо! ");
    }

    public void turnLeft() {
        System.out.println("Поварот налево! ");
    }

    public void printInfo() {
        System.out.println("Автомобиль макри " + brand + " класса " + classAuto + " с мотором мощностью " + engine.getPower() + " кВт, производства "
                + engine.getManufacturer() + ". Вес авто составляет " + weight + " кг. Автомобилем управляет " + driver.getFullName() + " со стажем вождения " + driver.getExperience() + " лет.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public void setClassAuto(String classAuto) {
        this.classAuto = classAuto;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
