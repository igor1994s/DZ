package by.teachmeskills.lessen15.taskOfLessen.task1;

public class Hobby {
    private String name;
    private int mark;

    public Hobby(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
