package by.belhard.sokolovskaya;

import java.util.Scanner;

public class ExceptionTask {

    void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ФИО через пробел: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        try {
            Info.checkInfo(name, age);
        } catch (IncorrectInfoException ex) {
            ex.printStackTrace();
        }
    }
}
