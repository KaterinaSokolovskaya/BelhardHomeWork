package by.belhard.sokolovskaya.company.vehicles;

public enum ClassOfCar {
    A("A - Mini cars"),
    B("B - Small cars"),
    C("C - Medium cars"),
    D("D - Larger cars"),
    E("E - Executive cars"),
    F("F - Luxury cars"),
    J("J - Sport utility"),
    M("M - Multi purpose cars"),
    S("S - Sport coupe"),
    L("L - Lorries");

    private final String title;

    ClassOfCar(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
