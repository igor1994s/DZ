package by.teachmeskills.lessen6OOP.instrument;

public class InstrumentAdd {
    public static void main(String[] args) {
        Drum d1=new Drum(1);
        Drum d2=new Drum(2);
        Guitar g1=new Guitar(6);
        Guitar g2=new Guitar(12);
        Trumpet t1=new Trumpet(12);
        Trumpet t2=new Trumpet(15);

        Instrument[] instrument=new Instrument[]{d1,g1,t1,t2,g2,d2};
        for (int i = 0; i < instrument.length; i++) {
            instrument[i].play();

        }
    }
}
