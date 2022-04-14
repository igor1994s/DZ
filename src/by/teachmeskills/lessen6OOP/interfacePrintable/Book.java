package by.teachmeskills.lessen6OOP.interfacePrintable;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Распечатать книгу с названием %s \n",name);
    }
    public static void printBooks(Printable[] p){
        for (int i = 0; i <p.length ; i++) {
            if(p[i]instanceof Book){
                System.out.print(((Book) p[i]).getName()+" ");
            }
        }
        System.out.println();
    }
}
