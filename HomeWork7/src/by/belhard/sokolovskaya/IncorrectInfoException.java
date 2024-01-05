package by.belhard.sokolovskaya;

public class IncorrectInfoException extends Exception {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public IncorrectInfoException(String message, String name, int age) {
        super(message);
        this.name = name;
        this.age = age;
    }
}