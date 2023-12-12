package by.belhard.sokolovskaya.vetClinic;

public class Rat extends Animal {
    public Rat(String name, int age) {
        super(name, age);
    }

    public Rat() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Пи-пи-пи");
    }
}
