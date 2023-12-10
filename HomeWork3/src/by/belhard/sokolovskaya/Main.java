package by.belhard.sokolovskaya;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = 5556432;
        phone1.model = "kL200";
        phone1.weight = 5.8;

        phone2.number = 2364852;
        phone2.model = "jHI3";
        phone2.weight = 6.3;

        phone3.number = 4628414;
        phone3.model = "003M";
        phone3.weight = 4.9;

        printPhone(phone1);
        printPhone(phone2);
        printPhone(phone3);

        phone1.receiveCall("Lena");
        int numberPhone1 = phone1.getNumber();
        phone2.receiveCall("Sasha");
        int numberPhone2 = phone2.getNumber();
        phone3.receiveCall("Pasha");
        int numberPhone3 = phone3.getNumber();

        Phone phone4 = new Phone(9653263, "J7");
        Phone phone5 = new Phone(4412211, "D4A", 6.6);

        phone4.receiveCall("Dima", 2223131);
        phone5.sendMessage(4451235, 4582314, 2531121, 6353326);

        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        IntArray intArray = new IntArray(array);
        intArray.print();
        intArray.sort(true);
        intArray.print();
        intArray.sort(false);
        intArray.print();
    }

    public static void printPhone(Phone phone) {
        System.out.println("Номер: " + phone.number);
        System.out.println("Модель: " + phone.model);
        System.out.println("Вес: " + phone.weight);
        System.out.println();
    }
}