package by.belhard.sokolovskaya.company.vehicles;

import by.belhard.sokolovskaya.company.details.Engine;
import by.belhard.sokolovskaya.company.professions.Driver;

public class SportCar extends Car {

    private int topSpeed;

    public SportCar(String carBrand, ClassOfCar classOfCar, int weight, Driver driver, Engine engine, int topSpeed) {
        super(carBrand, classOfCar, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    public SportCar() {
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Спортивный автомобиль марки " + super.getCarBrand() +
                " класса " + super.getClassOfCar() +
                " с максимальной скоростью " + topSpeed + " км/ч" +
                ", вес: " + super.getWeight() +
                ", " + super.getDriver() +
                ", " + super.getEngine();
    }
}
