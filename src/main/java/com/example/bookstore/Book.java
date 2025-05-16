package com.example.bookstore;

public class Book {

    String id;
    String title;
    String author;

    // default constructor
    public Book() {}

    // main constructor
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // getter
    public String getId() {
        return this.id;
    }

    // setter
    public void setId(String id) {
        this.id = id;
    }
}
