package by.belhard.sokolovskaya.company.details;

public class Engine {

    private int enginePower;
    private String producer;

    public Engine(int enginePower, String producer) {
        this.enginePower = enginePower;
        this.producer = producer;
    }

    public Engine() {
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Двигатель мощностью " + enginePower + " л.с." +
                ", производитель: " + producer;
    }
}
