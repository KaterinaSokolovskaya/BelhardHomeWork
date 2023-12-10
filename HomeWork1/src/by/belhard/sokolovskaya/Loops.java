package by.belhard.sokolovskaya;

import java.util.Scanner;

public class Loops {

    void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк для печати: ");
        int numberOfStrings = sc.nextInt();
        int i = 1;

        while (i <= numberOfStrings) {
            System.out.println("Task" + i++);
        }
    }

    void two() {
        int i = 1;
        int maxValue = 100;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= maxValue);
    }

    void three() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, факториал которого необходимо вычислить: ");
        int number = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    void four() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int min;
        int max;

        if (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                min = secondNumber;
                max = firstNumber;
            } else {
                min = firstNumber;
                max = secondNumber;
            }

            int[] numbers = new int[max - min - 1];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = --max;
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("Всего целых чисел в заданном промежутке: " + numbers.length);
        } else {
            System.out.println("В этом промежутке нет целых чисел.");
        }
    }

    void five() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два положительных целых числа: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int min;
        int max;

        if (firstNumber >= 0 && secondNumber >= 0) {
            if (firstNumber > secondNumber) {
                min = secondNumber;
                max = firstNumber;
            } else {
                min = firstNumber;
                max = secondNumber;
            }

            int c = max;
            while (c >= min) {
                c -= min;
            }

            System.out.println(c);
        } else {
            System.out.println("Числа должны быть положительными!");
        }
    }

    void six() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два положительных целых числа (стороны прямоугольника): ");
        int height = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("Введите положительное целое число (сторона квадрата): ");
        int square = sc.nextInt();

        int heightNumber = 0;
        int temp = height;
        while (temp >= square) {
            temp -= square;
            heightNumber++;
        }

        int widthNumber = 0;
        temp = width;
        while (temp >= square) {
            temp -= square;
            widthNumber++;
        }

        int result = 0;
        for (int i = 1; i <= heightNumber; i++) {
            for (int j = 1; j <= widthNumber; j++) {
                result++;
            }
        }

        System.out.println("Квадратов в прямоугольнике: " + result);
    }

    void seven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное целое число: ");
        int number = sc.nextInt();

        if (number > 0) {
            int temp = number;
            boolean isTwo = false;
            int numberOfDigits = 0;
            int sum = 0;
            int reverse = 0;

            while (temp > 0) {
                int currentNumber = temp % 10;
                if (currentNumber % 10 == 2) {
                    isTwo = true;
                }
                temp /= 10;
                numberOfDigits++;
                sum += currentNumber;
            }

            temp = number;
            for (int i = numberOfDigits; i > 0; i--) {
                int counter = 1;
                for (int j = i; j > 1; j--) {
                    counter *= 10;
                }
                reverse += (temp % 10) * counter;
                temp /= 10;
            }

            if (isTwo) {
                System.out.println("В записи числа есть цифра 2.");
            } else {
                System.out.println("В записи числа цифры 2 нет.");
            }
            System.out.println("Количество цифр: " + numberOfDigits);
            System.out.println("Сумма цифр: " + sum);
            System.out.println("Число в обратном порядке: " + reverse);
        } else {
            System.out.println("Некорректно введено число.");
        }
    }

    void eight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите процент (от 0 до 25): ");
        float percent = sc.nextFloat();
        float sum = 1000f;
        int months = 1;

        if (percent > 0 && percent < 25) {
            for (; sum < 1100f; months++) {
                sum += sum / 100 * percent;
            }
            System.out.println("Через " + months + " месяцев сумма будет составлять " + sum);
        } else {
            System.out.println("Некорректно введены проценты.");
        }
    }
}