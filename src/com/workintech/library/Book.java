package com.workintech.library;

import java.util.Objects;
import java.util.Set;

public class Book implements Comparable<Book>{
    private int id;
    private String name;
    private String publishYear;
    private Set<Author> authors;


    public Book(int id, String name, String publishYear, Set<Author> authors) {
        this.id = id;
        this.name = name;
        this.publishYear = publishYear;
        this.authors = authors;
        for(Author author: authors){
            author.addBook(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public Set<Author> getAuthor() {
        return authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String authorNames = "";
        for(Author author: authors){
            authorNames += author.getName() + ", ";
        }
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", authors='" + authorNames + '\'' + 
                '}';
    }


    @Override
    public int compareTo(Book book) {
        return name.compareTo(book.name);
    }
}
