package by.teachmeskills.lessen6_7_8OOP.interfacePrintable;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("Распечатать журнал с названием %s \n", name);
    }

    public static void printMagazins(Printable[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Magazine) {
                System.out.print(((Magazine) p[i]).getName() + " ");
            }
        }
        System.out.println();
    }
}

