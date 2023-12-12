package by.belhard.sokolovskaya.company.vehicles;

import by.belhard.sokolovskaya.company.details.Engine;
import by.belhard.sokolovskaya.company.professions.Driver;

public class Lorry extends Car {
    private int payloadCapacity;

    public Lorry(String carBrand, ClassOfCar classOfCar, int weight, Driver driver, Engine engine, int payloadCapacity) {
        super(carBrand, classOfCar, weight, driver, engine);
        this.payloadCapacity = payloadCapacity;
    }

    public Lorry() {
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль марки " + super.getCarBrand() +
                " класса " + super.getClassOfCar() +
                " грузопдъемностью " + payloadCapacity + " кг" +
                ", вес: " + super.getWeight() +
                ", " + super.getDriver() +
                ", " + super.getEngine();
    }
}
