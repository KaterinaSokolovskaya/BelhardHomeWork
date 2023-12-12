package by.belhard.sokolovskaya.company.professions;

public class Driver {

    private String fullName;
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public Driver() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Водитель " + fullName +
                " с опытом вождения " + drivingExperience +
                " лет";
    }
}
