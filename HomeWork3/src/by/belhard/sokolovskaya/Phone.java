package by.belhard.sokolovskaya;

public class Phone {
    int number;
    String model;
    double weight;

    Phone() {
    }

    Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + " " + number);
    }

    int getNumber() {
        return number;
    }

    void sendMessage(int... numbers) {
        System.out.println("Отправка сообщений на следующие номера: ");
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
