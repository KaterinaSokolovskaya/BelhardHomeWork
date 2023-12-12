package by.belhard.sokolovskaya.company.vehicles;

import by.belhard.sokolovskaya.company.details.Engine;
import by.belhard.sokolovskaya.company.professions.Driver;

public class Car {

    private String carBrand;
    private ClassOfCar classOfCar;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, ClassOfCar classOfCar, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public ClassOfCar getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(ClassOfCar classOfCar) {
        this.classOfCar = classOfCar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Автомобиль марки " + carBrand +
                " класса " + classOfCar +
                ", вес: " + weight +
                ", " + driver +
                ", " + engine;
    }
}
