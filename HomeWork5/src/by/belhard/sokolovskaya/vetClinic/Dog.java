package by.belhard.sokolovskaya.vetClinic;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
    }
}
