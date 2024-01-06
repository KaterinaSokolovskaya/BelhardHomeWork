package by.belhard.sokolovskaya.library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int exit = 0;
        List<Reader> readers = new ArrayList<>();
        int numberOfLibraryCard = 1;
        int id;
        boolean isReaderExist;

        do {
            System.out.println("Введите '1' для добавления читателя.");
            System.out.println("Введите '2' для добавления книги читателю.");
            System.out.println("Введите '3' для возвращения книги читателем.");
            System.out.println("Введите '4' для вывода информации о читателе.");
            System.out.println("Введите '5' для вывода информации обо всех читателях.");
            System.out.println("Введите '6' для сохранения списка читателей.");
            System.out.println("Введите '7' для восстановления списка читателей из файла.");
            System.out.println("Введите '8' для выхода из программы.");
            int actionNumber = sc.nextInt();
            sc.nextLine();
            switch (actionNumber) {
                case 1:
                    Reader reader = new Reader();
                    System.out.println("Введите полное имя: ");
                    reader.setName(sc.nextLine());
                    reader.setNumberOfLibraryCard(numberOfLibraryCard);
                    numberOfLibraryCard += 1;
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
                    readers.add(reader);
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
                    for (Reader r : readers) {
                        if (r.getNumberOfLibraryCard() == id) {
                            isReaderExist = true;
                            r.takeBook(book);
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
                    for (Reader r : readers) {
                        if (r.getNumberOfLibraryCard() == id) {
                            isReaderExist = true;
                            r.returnBook(bookName);
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
                    for (Reader r : readers) {
                        if (r.getNumberOfLibraryCard() == id) {
                            isReaderExist = true;
                            r.printStatus();
                            break;
                        }
                    }
                    if (!isReaderExist) {
                        System.out.println("Нет такого читателя.");
                    }
                    break;
                case 5:
                    readers.forEach(Reader::printStatus);
                    break;
                case 6:
                    System.out.println("Введите полный путь к файлу, в который необходимо сохранить список читателей: ");
                    String fileName = sc.nextLine();
                    boolean isReadersSave = FileUtil.saveReadersList(readers, fileName);
                    if (!isReadersSave) {
                        System.out.println("Список читателей не сохранен.");
                    }
                    break;
                case 7:
                    System.out.println("Введите полный путь к файлу, из которого необходимо восстановить список читателей: ");
                    String restoreFileName = sc.nextLine();
                    readers = FileUtil.restoreReadersList(restoreFileName);
                    break;
                case 8:
                    exit = actionNumber;
                    break;
                default:
                    System.out.println("Номер введен некорректно!");
            }
        } while (exit != 8);
    }
}