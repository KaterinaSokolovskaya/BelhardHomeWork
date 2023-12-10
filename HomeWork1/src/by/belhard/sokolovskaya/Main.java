package by.belhard.sokolovskaya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Для завершения работы программы введите '0'");
        int exit = 1;

        do {
            System.out.println("Введите '1' для запуска заданий по операторам или введите '2' для запуска заданий по циклам: ");
            int classNumber = sc.nextInt();
            if (classNumber == 1){
                Operators operators = new Operators();
                System.out.println("Введите номер задания для запуска: ");
                int taskNumber = sc.nextInt();
                switch (taskNumber) {
                    case 0:
                        exit = taskNumber;
                        break;
                    case 1:
                        operators.one();
                        break;
                    case 2:
                        operators.two();
                        break;
                    case 3:
                        operators.three();
                        break;
                    case 4:
                        operators.four();
                        break;
                    case 5:
                        operators.five();
                        break;
                    case 6:
                        operators.six();
                        break;
                    case 7:
                        operators.seven();
                        break;
                    case 8:
                        operators.eight();
                        break;
                }
            } else if (classNumber == 2) {
                Loops loops = new Loops();
                System.out.println("Введите номер задания для запуска: ");
                int taskNumber = sc.nextInt();
                switch (taskNumber) {
                    case 0:
                        exit = taskNumber;
                        break;
                    case 1:
                        loops.one();
                        break;
                    case 2:
                        loops.two();
                        break;
                    case 3:
                        loops.three();
                        break;
                    case 4:
                        loops.four();
                        break;
                    case 5:
                        loops.five();
                        break;
                    case 6:
                        loops.six();
                        break;
                    case 7:
                        loops.seven();
                        break;
                    case 8:
                        loops.eight();
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