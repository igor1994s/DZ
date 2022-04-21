package by.teachmeskills.lessen6_7_8OOP.onlineStore;

public class OnlineStoreApp {
    public static void main(String[] args) {

        Product bananа=new Product("Банан", 3.5, 8.0);
        Product orange=new Product("Апельсин",4.5,7.4);
        Product kivi=new Product("Киви",5.1, 8.3);
        Product potatoes=new Product("Картошка",2.0,7.6);
        Product carrot=new Product("Морковь",1.5,8.0);
        Product beet=new Product("Свекла",3.5,9.4);

        Product[] veg=new Product[] {beet,carrot,potatoes};
        Product[] fru=new Product[] {kivi, orange, bananа};
        Product[] bac=new Product[]{bananа,kivi,potatoes,beet};

        Category vegetables=new Category("Овощи",veg);
        Category fruit=new Category("Фрукты",fru);

        Basket januar=new Basket(bac);
        System.out.println(januar.toString());

        User vadim=new User("vadim1344","134492",januar);

    }
}
