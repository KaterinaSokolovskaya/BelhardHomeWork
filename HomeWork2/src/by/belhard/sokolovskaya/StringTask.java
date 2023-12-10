package by.belhard.sokolovskaya;

import java.util.Scanner;

public class StringTask {

    void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = sc.nextLine();
        System.out.println("Введите символ:");
        char letter = sc.nextLine().charAt(0);

        char[] letters = str.toCharArray();
        int counter = 0;

        for (char c : letters) {
            if (c == letter) {
                counter++;
            }
        }
        System.out.println("Количество вхождений символа в строку: " + counter);
    }

    void two() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = sc.nextLine();
        do {
            System.out.println(str);
            if (str.isEmpty()) {
                System.out.println("Пожалуйста, повторите ввод");
                System.out.println("Введите строку:");
                str = sc.nextLine();
            }
        } while (str.isEmpty());

        System.out.println("Введите первый символ:");
        char a = sc.nextLine().charAt(0);
        System.out.println("Введите второй символ:");
        char b = sc.nextLine().charAt(0);

        System.out.println(str.replace(a, b));
    }
}
