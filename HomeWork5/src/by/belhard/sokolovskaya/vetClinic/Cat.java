package by.belhard.sokolovskaya.vetClinic;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу-мяу");
    }
}
