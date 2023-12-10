package by.belhard.sokolovskaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Для завершения работы программы введите '0'");
        int exit = 1;

        do {
            System.out.println("Введите '1' для запуска заданий по массивам или введите '2' для запуска заданий по строкам: ");
            int classNumber = sc.nextInt();
            if (classNumber == 1){
                ArrayTask arrays = new ArrayTask();
                System.out.println("Введите номер задания для запуска: ");
                int taskNumber = sc.nextInt();
                switch (taskNumber) {
                    case 0:
                        exit = taskNumber;
                        break;
                    case 1:
                        arrays.one();
                        break;
                    case 2:
                        arrays.two();
                        break;
                    case 3:
                        arrays.three();
                        break;
                    case 4:
                        arrays.four();
                        break;
                    case 5:
                        arrays.five();
                        break;
                    case 6:
                        arrays.six();
                        break;
                    case 7:
                        arrays.seven();
                        break;
                }
            } else if (classNumber == 2) {
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
                }
            } else if (classNumber == 0) {
                exit = classNumber;
            } else {
                System.out.println("Неверно введен номер!");
            }
        } while (exit != 0);
    }
}