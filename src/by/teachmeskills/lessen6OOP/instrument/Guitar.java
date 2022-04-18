package by.teachmeskills.lessen6OOP.instrument;

public class Guitar implements Instrument{
    int valueStrings;

    public Guitar(int valueStrings) {
        this.valueStrings = valueStrings;
    }

    public Guitar() {
    }

    public int getValueStrings() {
        return valueStrings;
    }

    public void setValueStrings(int valueStrings) {
        this.valueStrings = valueStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет "+valueStrings +"-струнная гитара! ");
    }
}
