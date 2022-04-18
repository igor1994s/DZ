package by.teachmeskills.lessen6OOP.clothes;

public class Atelier {

    public void dressAMan(Clothes [] clothes){
        for (Clothes cl:clothes) {
            if(cl.dressAMan()!=null){
                System.out.println(cl.dressAMan());
            }
        }

    }

    public void dressAWoman(Clothes [] clothes){
        for (Clothes cl:clothes) {
            if(cl.dressAWoman()!=null){
                System.out.println(cl.dressAWoman());
            }
        }

    }

}
