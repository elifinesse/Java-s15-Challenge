package com.workintech.library.literature;

import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.people.Author;

public class Main {
    public static void main(String[] args) {
        /* Literature journal = new Journal(2, "hi", LocalDate.of(2020, 1, 8), 2, 1, null);
        Book book = new Book(1, "abc", 1, false, null, null);
        Book book2 = new Book(1, "aedf", 2, false, null, null);
        Book book3 = new Book(2, "aedf", 2, false, null, null);
        Book book4 = new Book(3, "aedf", 2, false, null, null);
        Set<Book> books = new TreeSet<>();
        books.add(book4);
        books.add(book3);
        books.add(book2);
        books.add(book);
        System.out.println(books); */
        /* System.out.println(book.equals(book2));
        System.out.println(book);
        System.out.println(journal); */


        Author author = new Author(1, "shakespeare", null);
        Author author2 = new Author(2, "scandinavian myth", null);
        /* Set<Author> authors = new TreeSet<>();
        authors.add(author); 
        authors.add(author2); */ 
        Book book = new Book(1, "hamlet", 2, false, null, null, Category.DRAMA);
        book.addAuthor(author2);
        book.addAuthor(author);

        System.out.println(author);
        System.out.println("***********");
        System.out.println(book.getAuthors());
    }
}
