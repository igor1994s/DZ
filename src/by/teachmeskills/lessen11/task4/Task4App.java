package by.teachmeskills.lessen11.task4;

//4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После сериализации произвести обратный процесс.

import java.io.InvalidObjectException;

public class Task4App {
    public static void main(String[] args) {
        Auto audi = new Auto("audi", 220, 21200);
        Serializator serializator = new Serializator();
        System.out.println(serializator.serialization(audi));
        try {
            Auto auto = serializator.deserialization();
            System.out.println(auto.getBrand());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
