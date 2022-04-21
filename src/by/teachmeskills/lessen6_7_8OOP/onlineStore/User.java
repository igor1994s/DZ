package by.teachmeskills.lessen6_7_8OOP.onlineStore;

public class User {

     private String login;
     private String password;
     private Basket backet;

    public User(String login,String password, Basket backet){
        this.login=login;
        this.password=password;
        this.backet=backet;
        System.out.printf("Покупатель с ником %s купил продукты!\n",login);
    }

    public User() {
    }
}
