package by.teachmeskills.lessen6;
//а)
public class Phone {
    String model;
    String number;
    int weight;
//д)
    Phone(String number, String model, int weight){
        this.weight=weight;
    }
//е)
    Phone(String number, String model){
        this.number=number;
        this.model=model;
    }
//ж)
    Phone(){
    }
//г)
    void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    String getNumber(){
        return this.number;
    }

    public static void main(String[] args) {
//б)
    Phone ph1=new Phone();
    ph1.model="Nokia";
    ph1.number="+375291112233";
    ph1.weight=120;
    Phone ph2=new Phone();
    ph2.model="Siemens";
    ph2.number="+375292221133";
    ph2.weight=130;
    Phone ph3=new Phone();
    ph3.model="Xiaomi";
    ph3.number="+375293331122";
    ph3.weight=140;
//в)
        System.out.println("Мы успешно создали 3 телефона! ");
        System.out.println("1) "+ph1.model+" c номером "+ph1.number+" и весом "+ph1.weight+" грамм.");
        System.out.println("2) "+ph2.model+" c номером "+ph2.number+" и весом "+ph2.weight+" грамм.");
        System.out.println("3) "+ph3.model+" c номером "+ph3.number+" и весом "+ph3.weight+" грамм.");
//г)
    ph1.receiveCall("Василий");
    ph1.getNumber();
    ph2.receiveCall("Ксения");
    ph2.getNumber();
    ph3.receiveCall("Виталий");
    ph3.getNumber();

    }
}
