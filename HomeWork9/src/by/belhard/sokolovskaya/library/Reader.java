package by.belhard.sokolovskaya.library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reader implements Serializable {
    private String name;
    private int numberOfLibraryCard;
    private String faculty;
    private Date dateOfBirth;
    private int phone;
    private List<Book> bookList;

    public Reader(String name, int numberOfLibraryCard, String faculty, Date dateOfBirth, int phone) {
        this.name = name;
        this.numberOfLibraryCard = numberOfLibraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.bookList = new ArrayList<>();
    }

    public Reader() {
        bookList = new ArrayList<>();
    }

    public void takeBook(Book book) {
        bookList.add(book);
        System.out.println(name + " взял книгу " + book.getName());
    }

    public void returnBook(String bookName) {
        int index = -1;
        for (Book book : bookList) {
            if (book.getName().equals(bookName)) {
                index = bookList.indexOf(book);
            }
        }
        if (index == -1) {
            System.out.println(name + " не хранит книгу " + bookName);
        } else {
            bookList.remove(index);
            System.out.println(name + " вернул книгу " + bookName);
        }
    }

    public void printStatus() {
        if (bookList.size() == 0) {
            System.out.println(name + " не хранит ни одной книги.");
        } else {
            System.out.println(numberOfLibraryCard + ":" + name + " взял " + bookList.size() + " книг: ");
            bookList.forEach(b -> System.out.println(b.getName()));
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

    public void setBookList(List<Book> bookList) {
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

    public List<Book> getBookList() {
        return bookList;
    }
}