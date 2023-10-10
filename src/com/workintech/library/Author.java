package com.workintech.library;

import java.util.Objects;
import java.util.TreeSet;

public class Author implements Comparable<Author> {
    private int author_id;
    private String name;
    private TreeSet<Book> books;


    public Author(int author_id, String name) {
        this.author_id = author_id;
        this.name = name;
        this.books = new TreeSet<>(); //hard dependency(fix later)
    }

    public int getAuthor_id() {
        return author_id;
    }

    public String getName() {
        return name;
    }

    public TreeSet<Book> getBooks() {
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
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return author_id == author.author_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author_id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public int compareTo(Author author) {
        return name.compareTo(author.name);
    }
}
