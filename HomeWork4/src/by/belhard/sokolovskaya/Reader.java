package by.belhard.sokolovskaya;

import java.util.Date;

public class Reader {
    private String name;
    private int numberOfLibraryCard;
    private String faculty;
    private Date dateOfBirth;
    private int phone;
    private Book[] bookList;

    public Reader(String name, int numberOfLibraryCard, String faculty, Date dateOfBirth, int phone) {
        this.name = name;
        this.numberOfLibraryCard = numberOfLibraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.bookList = new Book[10];
    }

    public Reader() {
        bookList = new Book[10];
    }

    public void takeBook(Book book) {
        boolean isFull = true;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                bookList[i] = book;
                System.out.println(name + " взял книгу " + book.getName());
                isFull = false;
                break;
            }
        }
        if (isFull){
            System.out.println("Количество книг уже максимальное!");
        }
    }

    public void returnBook(String bookName) {
        boolean isBookInList = false;
        int index = -1;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null && bookList[i].getName().equals(bookName)) {
                isBookInList = true;
                index = i;
                break;
            }
        }
        if (isBookInList) {
            for (int i = index; i < bookList.length - 1; i++) {
                bookList[i] = bookList[i + 1];
            }
            System.out.println(name + " вернул книгу " + bookName);
        } else {
            System.out.println(name + " не хранит книгу " + bookName);
        }

    }

    public void printStatus() {
        int numberOfBooks;
        for (numberOfBooks = 0; numberOfBooks < bookList.length; numberOfBooks++) {
            if (bookList[numberOfBooks] == null) {
                break;
            }
        }
        System.out.println(numberOfLibraryCard + ":" + name + " взял " + numberOfBooks + " книг: ");
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[0] == null) {
                System.out.println(name + " не хранит ни одной книги.");
                break;
            } else if (bookList[i + 1] == null) {
                System.out.println(bookList[i].getName());
                break;
            } else {
                System.out.println(bookList[i].getName() + ", ");
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfLibraryCard(int numberOfLibraryCard) {
        this.numberOfLibraryCard = numberOfLibraryCard;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLibraryCard() {
        return numberOfLibraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPhone() {
        return phone;
    }

    public Book[] getBookList() {
        return bookList;
    }
}
