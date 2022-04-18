package by.teachmeskills.lessen6_7_8OOP.animal;

public class AnimalApp {

    public static void main(String[] args) {
        Animal cat1=new Cat("Валилий","рыбу","Европе","Сиамская");
        Animal dog1 =new Dog("Мурзик","мясо","Европе","Охотничья");
        Animal horse1=new Horse("Форсаж","траву","Европе","белый",4);
        Animal[] animals=new Animal[]{cat1,dog1,horse1};
        for(Animal i:animals){
            Veterinarian.treatAnimal(i);
        }
    }
}
