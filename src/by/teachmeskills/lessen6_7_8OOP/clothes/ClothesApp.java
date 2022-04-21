package by.teachmeskills.lessen6_7_8OOP.clothes;

public class ClothesApp {
    public static void main(String[] args) {
        Skirt skirt=new Skirt(Size.XXS,12.4, " черный");
        Tie tie =new Tie(Size.XS, 5.6," желтый");
        Trousers trousers=new Trousers(Size.S,14.2," коричневый");
        TShirt tShirt=new TShirt(Size.L, 25.1,"белый");

        Clothes[] clothes={skirt,tie,trousers,tShirt};

        Atelier atelier=new Atelier();

        atelier.dressAMan(clothes);
        System.out.println();
        atelier.dressAWoman(clothes);
    }

}
