package by.teachmeskills.lessen6_7_8OOP.onlineStore;

public class Basket {
    private Product[] basket;

    public Basket() {
    }

    public Basket(Product[] basket) {
        this.basket = basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }

    public Product[] getBasket() {
        return basket;
    }
    @Override
    public String toString(){
        String st="Продукты в корзине: ";
        for (int i = 0; i < basket.length; i++) {
            st+=basket[i].getName()+", ";
        }
        return st;
    }
}
