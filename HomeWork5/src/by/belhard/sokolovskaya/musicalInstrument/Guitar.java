package by.belhard.sokolovskaya.musicalInstrument;

public class Guitar implements Instrument {

    int numberOfStrings;

    public Guitar() {
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, с " + numberOfStrings + " струнами.");
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
