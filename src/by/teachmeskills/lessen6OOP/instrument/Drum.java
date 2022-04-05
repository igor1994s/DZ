package by.teachmeskills.lessen6OOP.instrument;

public class Drum implements Instrument{
    int size;
    public Drum(int size){
        this.size =size;
    }

    public Drum() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан "+size +" размера! ");
    }
}
