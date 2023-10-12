package com.workintech.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.literature.Book;
import com.workintech.library.literature.Category;
import com.workintech.library.people.Author;
import com.workintech.library.people.Member;
import com.workintech.library.people.MembershipType;
import com.workintech.library.people.Person;

public class Main {
    public static void main(String[] args) {
        Person member1 = new Member("1", "Roy, Logan", MembershipType.SENIOR);
        Author author = new Author("1", "shakespeare", null);
        Author author2 = new Author("2", "scandinavian myth", null);
        Set<Author> authors = new TreeSet<>();
        authors.add(author); 
        authors.add(author2);
        Book book = new Book(1, "hamlet", 2, false, authors, null, Category.DRAMA);
        List<Book> borrowedbooks = new ArrayList<>();
        borrowedbooks.add(book); 
        ((Member)member1).borrowBook(book);
        System.out.println(member1);
    }
}
