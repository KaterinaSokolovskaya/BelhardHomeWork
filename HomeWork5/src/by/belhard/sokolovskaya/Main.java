package by.belhard.sokolovskaya;

import by.belhard.sokolovskaya.company.details.Engine;
import by.belhard.sokolovskaya.company.professions.Driver;
import by.belhard.sokolovskaya.company.vehicles.Car;
import by.belhard.sokolovskaya.company.vehicles.ClassOfCar;
import by.belhard.sokolovskaya.company.vehicles.Lorry;
import by.belhard.sokolovskaya.company.vehicles.SportCar;
import by.belhard.sokolovskaya.musicalInstrument.Drum;
import by.belhard.sokolovskaya.musicalInstrument.Guitar;
import by.belhard.sokolovskaya.musicalInstrument.Instrument;
import by.belhard.sokolovskaya.musicalInstrument.Tuba;
import by.belhard.sokolovskaya.vetClinic.Animal;
import by.belhard.sokolovskaya.vetClinic.Cat;
import by.belhard.sokolovskaya.vetClinic.Dog;
import by.belhard.sokolovskaya.vetClinic.Rat;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Шарик");
        dog.setAge(7);

        Cat cat = new Cat("Барсик", 5);
        Rat rat = new Rat("Аркадий", 2);

        dog.makeNoise();
        cat.makeNoise();
        rat.makeNoise();

        Animal animal = new Dog("Мухтар", 3);
        animal.makeNoise();

        System.out.println();

        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum(5);
        instruments[2] = new Tuba(4);

        for (Instrument instrument : instruments) {
            instrument.play();
        }

        System.out.println();

        Car car = new Car("Volvo", ClassOfCar.C, 2500,
                new Driver("Ivanov I.I.", 15),
                new Engine(200, "Geely"));
        System.out.println(car);
        Lorry lorry = new Lorry("DAF", ClassOfCar.L, 20000,
                new Driver("Petrov P.P.", 20),
                new Engine(500, "DAF Trucks NV"),
                40000);
        SportCar sportCar = new SportCar("Subaru", ClassOfCar.J, 2000,
                new Driver("Smirnov A.A.", 10),
                new Engine(268, "Subaru"),
                240);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}