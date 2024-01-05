package by.belhard.sokolovskaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Для завершения работы программы введите '0'");
        int exit = 1;

        do {
            System.out.println("Введите '1' для запуска заданий по строкам или введите '2' для запуска заданий по исключениям: ");
            int classNumber = sc.nextInt();
            if (classNumber == 1) {
                StringTask strings = new StringTask();
                System.out.println("Введите номер задания для запуска: ");
                int taskNumber = sc.nextInt();
                switch (taskNumber) {
                    case 0:
                        exit = taskNumber;
                        break;
                    case 1:
                        strings.one();
                        break;
                    case 2:
                        strings.two();
                        break;
                    case 3:
                        strings.three();
                        break;
                    case 4:
                        strings.four();
                        break;
                    case 5:
                        strings.five();
                        break;
                }
            } else if (classNumber == 2) {
                ExceptionTask exceptions = new ExceptionTask();
                System.out.println("Введите номер задания для запуска: ");
                int taskNumber = sc.nextInt();
                switch (taskNumber) {
                    case 0:
                        exit = taskNumber;
                        break;
                    case 1:
                        exceptions.one();
                        break;
                }
            } else if (classNumber == 0) {
                exit = classNumber;
            } else {
                System.out.println("Неверно введен номер!");
            }
        } while (exit != 0);
    }
}