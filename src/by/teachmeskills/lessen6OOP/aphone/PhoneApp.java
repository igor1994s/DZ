package by.teachmeskills.lessen6OOP.aphone;

public class PhoneApp {
    public static void main(String[] args) {

        Phone ph1=new Phone("Nokia","+375291112233",120);
        Phone ph2=new Phone("Siemens","+375292221133");
        ph2.setWeight(130);
        Phone ph3=new Phone();
        ph3.setModel("Xiaomi");
        ph3.setNumber("+375293331122");
        ph3.setWeight(140);

        System.out.println("Мы успешно создали 3 телефона! ");
        System.out.println("1) "+ph1.getModel()+" c номером "+ph1.getNumber()+" и весом "+ph1.getWeight()+" грамм.");
        System.out.println("2) "+ph2.getModel()+" c номером "+ph2.getNumber()+" и весом "+ph2.getWeight()+" грамм.");
        System.out.println("3) "+ph3.getModel()+" c номером "+ph3.getNumber()+" и весом "+ph3.getWeight()+" грамм.");

        ph1.receiveCall("Василий");
        ph2.receiveCall("Ксения");
        ph3.receiveCall("Виталий","+375291548956");
    }
}
