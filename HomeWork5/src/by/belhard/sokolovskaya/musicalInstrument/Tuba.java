package by.belhard.sokolovskaya.musicalInstrument;

public class Tuba implements Instrument {

    int diameter;

    public Tuba() {
    }

    public Tuba(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет туба, диаметром " + diameter + ".");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
