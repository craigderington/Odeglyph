package com.example.bookstore;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class BookstoreController {

    private final Map<String, Book> books = new HashMap<>() {{
        put("1", new Book("1", "Red Dawn", "John Joe"));
    }};

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks() {
        return books.values();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable String id) {
        Book book = books.get(id);
        if (book == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
        }
        return books.get(id);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable String id) {
        Book book = books.remove(id);
        if (book == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found");
        }
    }

    @PostMapping("/books/")
    public Book addBook(@RequestBody Book book) {
        book.setId(UUID.randomUUID().toString());
        books.put(book.getId(), book);
        return book;
    }
}
