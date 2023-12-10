package by.belhard.sokolovskaya;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask {

    void one() {
        int[] ar = new int[4];
        Random random = new Random();
        boolean isIncrease = false;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(100 - 10) + 10;
            System.out.print(ar[i] + " ");
            System.out.println();
        }

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] < ar[i + 1]) {
                isIncrease = true;
            } else {
                isIncrease = false;
                break;
            }
        }

        if (isIncrease) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }

    void two() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        int min;
        int max;

        do {
            System.out.println("Введите размер массива: ");
            arraySize = sc.nextInt();
        } while (arraySize <= 0);

        do {
            System.out.println("Введите нижний диапазон значений: ");
            min = sc.nextInt();
            System.out.println("Введите верхний диапазон значений: ");
            max = sc.nextInt();
        } while (min > max);

        int[] ar = new int[arraySize];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(max - min + 1) + min;
            System.out.print(ar[i] + "  ");
        }
        System.out.println();
    }

    void three() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        int min;
        int max;

        do {
            System.out.println("Введите размер массива: ");
            arraySize = sc.nextInt();
        } while (arraySize <= 0);

        do {
            System.out.println("Введите нижний диапазон значений: ");
            min = sc.nextInt();
            System.out.println("Введите верхний диапазон значений: ");
            max = sc.nextInt();
        } while (min > max);

        int[] ar = new int[arraySize];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(max - min + 1) + min;
            System.out.print(ar[i] + "  ");
        }
        System.out.println();

        int maxElement = 0;
        int index = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > maxElement) {
                maxElement = ar[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Индекс максимального элемента: " + index);
    }

    void four() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        int min;
        int max;

        do {
            System.out.println("Введите размер массива: ");
            arraySize = sc.nextInt();
        } while (arraySize <= 0);

        do {
            System.out.println("Введите нижний диапазон значений: ");
            min = sc.nextInt();
            System.out.println("Введите верхний диапазон значений: ");
            max = sc.nextInt();
        } while (min > max);

        int[] ar = new int[arraySize];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(max - min + 1) + min;
            System.out.print(ar[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");
        }
        System.out.println();
    }

    void five() {
        int[] ar = new int[20];
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(50 + 1);
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        System.out.println("Введите число (от 0 до 50): ");
        int num = sc.nextInt();

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == num) {
                System.out.println("Число найдено под индексом: " + i);
            }
        }
    }

    void six() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        int min;
        int max;

        do {
            System.out.println("Введите размер массива: ");
            arraySize = sc.nextInt();
        } while (arraySize <= 0);

        do {
            System.out.println("Введите нижний диапазон значений: ");
            min = sc.nextInt();
            System.out.println("Введите верхний диапазон значений: ");
            max = sc.nextInt();
        } while (min > max);

        int[] ar = new int[arraySize];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(max - min + 1) + min;
            System.out.print(ar[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < ar.length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");
        }
        System.out.println();
    }

    void seven() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int arraySize;
        int min;
        int max;

        do {
            System.out.println("Введите размер массива: ");
            arraySize = sc.nextInt();
        } while (arraySize <= 0);

        do {
            System.out.println("Введите нижний диапазон значений: ");
            min = sc.nextInt();
            System.out.println("Введите верхний диапазон значений: ");
            max = sc.nextInt();
        } while (min > max);

        int[] ar = new int[arraySize];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(max - min + 1) + min;
            System.out.print(ar[i] + "  ");
        }
        System.out.println();

        for (int i = ar.length - 1; i >= 0; i--) {
            int maxIndex = i;
            for (int j = i; j >= 0; j--) {
                if (ar[j] > ar[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = ar[maxIndex];
                ar[maxIndex] = ar[i];
                ar[i] = temp;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");
        }
        System.out.println();

        int value;
        int index = -1;
        int linearSearch = 0;
        int binarySearch = 0;
        int lowIndex = 0;
        int highIndex = ar.length - 1;

        System.out.println("Введите искомое значение: ");
        value = sc.nextInt();

        for (int i = 0; i < ar.length; i++) {
            linearSearch++;
            if (ar[i] == value) {
                index = i;
                break;
            }
        }

        while (lowIndex <= highIndex){
            binarySearch++;
            int midIndex = (lowIndex + highIndex) / 2;
            if (value == ar[midIndex]){
                index = midIndex;
                break;
            } else if (value < ar[midIndex]) {
                highIndex = midIndex - 1;
            } else if (value > ar[midIndex]){
                lowIndex = midIndex + 1;
            }
        }

        if (index >= 0) {
            System.out.println("Индекс элемента: " + index);
            System.out.println("Линейный поиск: " + linearSearch + " шаг(-а)(-ов)");
            System.out.println("Двоичный поиск: " + binarySearch + " шаг(-а)(-ов)");
        } else {
            System.out.println("Искомое число не найдено в массиве.");
        }
    }
}
