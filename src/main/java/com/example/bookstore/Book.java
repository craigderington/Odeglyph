package com.example.bookstore;

public class Book {

    private String id;
    private String title;
    private String author;

    public Book() {}

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
