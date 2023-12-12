package by.belhard.sokolovskaya.musicalInstrument;

public class Drum implements Instrument {

    int size;

    public Drum() {
    }

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, " + size + " размера.");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
