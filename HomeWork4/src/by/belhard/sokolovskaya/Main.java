package by.belhard.sokolovskaya;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int exit = 0;
        Reader[] readers = new Reader[10];
        int numberOfLibraryCard = 1;
        int id;
        boolean isReaderExist;

        do {
            System.out.println("Введите '1' для добавления читателя.");
            System.out.println("Введите '2' для добавления книги читателю.");
            System.out.println("Введите '3' для возвращения книги читателем.");
            System.out.println("Введите '4' для вывода информации о читателе.");
            System.out.println("Введите '5' для вывода информации обо всех читателях.");
            System.out.println("Введите '6' для выхода из программы.");
            int actionNumber = sc.nextInt();
            sc.nextLine();
            switch (actionNumber) {
                case 1:
                    boolean isFull = true;
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            Reader reader = new Reader();
                            System.out.println("Введите полное имя: ");
                            reader.setName(sc.nextLine());
                            reader.setNumberOfLibraryCard(numberOfLibraryCard);
                            numberOfLibraryCard += 1;//Проверить как работает после метода принта
                            System.out.println("Введите название факультета: ");
                            reader.setFaculty(sc.nextLine());
                            System.out.println("Введите год рождения: ");
                            int year = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Введите месяц рождения: ");
                            int month = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Введите день рождения: ");
                            int day = sc.nextInt();
                            sc.nextLine();
                            reader.setDateOfBirth(new Date(day, month, year));
                            System.out.println("Введите номер телефона: ");
                            reader.setPhone(sc.nextInt());
                            sc.nextLine();
                            readers[i] = reader;
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное!");
                    }
                    break;
                case 2:
                    Book book = new Book();
                    System.out.println("Введите название книги: ");
                    book.setName(sc.nextLine());
                    System.out.println("Введите автора книги: ");
                    book.setAuthorName(sc.nextLine());
                    System.out.println("Введите номер читательского билета: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    isReaderExist = false;
                    for (Reader reader : readers) {
                        if (reader != null && reader.getNumberOfLibraryCard() == id) {
                            isReaderExist = true;
                            reader.takeBook(book);
                            break;
                        }
                    }
                    if (!isReaderExist) {
                        System.out.println("Нет такого читателя.");
                    }
                    break;
                case 3:
                    System.out.println("Введите название книги: ");
                    String bookName = sc.nextLine();
                    System.out.println("Введите номер читательского билета: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    isReaderExist = false;
                    for (Reader reader : readers) {
                        if (reader != null && reader.getNumberOfLibraryCard() == id) {
                            isReaderExist = true;
                            reader.returnBook(bookName);
                            break;
                        }
                    }
                    if (!isReaderExist) {
                        System.out.println("Нет такого читателя.");
                    }
                    break;
                case 4:
                    System.out.println("Введите номер читательского билета: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    isReaderExist = false;
                    for (Reader reader : readers) {
                        if (reader != null && reader.getNumberOfLibraryCard() == id) {
                            isReaderExist = true;
                            reader.printStatus();
                            break;
                        }
                    }
                    if (!isReaderExist) {
                        System.out.println("Нет такого читателя.");
                    }
                    break;
                case 5:
                    for (Reader reader : readers) {
                        if (reader != null) {
                            reader.printStatus();
                        }
                    }
                    break;
                case 6:
                    exit = actionNumber;
                    break;
                default:
                    System.out.println("Номер введен некорректно!");
            }

        } while (exit != 6);
    }
}