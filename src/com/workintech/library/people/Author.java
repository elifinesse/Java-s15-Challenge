package com.workintech.library.people;

import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.literature.Book;

public class Author extends Person {

    private Set<Book> books;

    public Author(String id, String fullName) {
        super(id, fullName);
        this.books = new TreeSet<>(); //hard dependency(fix later)
    }

    public Author(String id, String fullName, Set<Book> books) {
        super(id, fullName);
        this.books = books;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (books == null) {
            books = new TreeSet<>();
        }
        if (!books.contains(book)) {
            books.add(book);
        }
    }
    
}

