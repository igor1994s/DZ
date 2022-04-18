package by.teachmeskills.lessen6_7_8OOP.onlineStore;

public class Category {
    private String name;
    private Product  product[];

    public Category(String name,Product product[]){
        this.name=name;
        this.product=product;
        System.out.printf("Категория %s создана.\n",this.name);
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProduct() {
        return product;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }
}
