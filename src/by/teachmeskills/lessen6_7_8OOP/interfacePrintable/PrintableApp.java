package by.teachmeskills.lessen6_7_8OOP.interfacePrintable;

public class PrintableApp {
    public static void main(String[] args) {
        Book shantaram=new Book("Шантарам");
        Book java=new Book("Java");
        Magazine energetika =new Magazine("Энергетика");

        Printable[] p=new Printable[]{shantaram,java,energetika};

        for (int i = 0; i < p.length; i++) {
            p[i].print();
        }
        Book.printBooks(p);
        Magazine.printMagazins(p);
    }
}
