package com.workintech.library;

import java.util.ArrayList;
import java.util.List;

import com.workintech.library.people.Author;
import com.workintech.library.people.Librarian;
import com.workintech.library.people.Member;
import com.workintech.library.people.Person;
import com.workintech.library.literature.Book;
import com.workintech.library.literature.Literature;
import com.workintech.library.literature.Periodical;

public class Library {
    private List<Literature> allLiterature;
    private List<Book> books;
    private List<Periodical> magazines;
    private List<Periodical> journals;
    private List<Person> members;
    private List<Author> authors;
    private List<Librarian> librarians;

    public Library(List<Book> books, List<Periodical> magazines, List<Periodical> journals, List<Person> members, List<Author> authors, List<Librarian> librarians){
        this.books = books;
        this.magazines = magazines;
        this.journals = journals;
        this.members = members;
        this.authors = authors;
        this.librarians = librarians;
        allLiterature = new ArrayList<>();
        allLiterature.addAll(journals);
        allLiterature.addAll(books);
        allLiterature.addAll(magazines);
    }
    public List<Literature> getAllLiterature() {
        return allLiterature;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Periodical> getJournals() {
        return journals;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public List<Periodical> getMagazines() {
        return magazines;
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setAllLiterature(List<Literature> allLiterature) {
        this.allLiterature = allLiterature;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setJournals(List<Periodical> journals) {
        this.journals = journals;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }

    public void setMagazines(List<Periodical> magazines) {
        this.magazines = magazines;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }
}
