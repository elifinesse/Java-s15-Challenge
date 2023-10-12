package com.workintech.library;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(1, "shakespeare");
        Author author2 = new Author(2, "scandinavian myth");
        Set<Author> authors = new TreeSet<>();
        authors.add(author); 
        authors.add(author2); 
        Book book = new Book(1, "hamlet", "16th c.", authors);

        System.out.println(author);
        System.out.println("***********");
        System.out.println(book.getAuthor());
    }
}
