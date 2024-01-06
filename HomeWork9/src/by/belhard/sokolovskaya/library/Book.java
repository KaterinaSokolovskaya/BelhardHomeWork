package by.belhard.sokolovskaya.library;

import java.io.Serializable;

public class Book implements Serializable {

    private String name;
    private String authorName;
    private String text;

    public Book() {
    }

    public Book(String name, String authorName, String text) {
        this.name = name;
        this.authorName = authorName;
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getText() {
        return text;
    }
}
