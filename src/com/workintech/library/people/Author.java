package com.workintech.library.people;

import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.literature.Book;

public class Author extends Person {

    private Set<Book> books;

    public Author(String id, String fullName) {
        super(id, fullName);
        this.books = new TreeSet<>();
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
            books.add(book);
        }
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    @Override
    public String toString() {
        Set<String> bookNames = new TreeSet<>();
        for(Book book: books){
            bookNames.add(book.getName());
        }
        return super.toString() + ", " +
                "books=" + bookNames +
                '}';
    }
}

