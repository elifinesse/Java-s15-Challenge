package com.workintech.library;

import java.util.List;

import com.workintech.library.people.Author;
import com.workintech.library.people.Librarian;
import com.workintech.library.people.Member;
import com.workintech.library.literature.Book;
import com.workintech.library.literature.Journal;
import com.workintech.library.literature.Literature;
import com.workintech.library.literature.Magazine;

public class Library {
    private List<Literature> allLiterature;
    private List<Book> books;
    private List<Magazine> magazines;
    private List<Journal> journals;
    private List<Member> members;
    private List<Author> authors;
    private List<Librarian> librarians;

    public Library(List<Literature> allLiterature, List<Book> books, List<Magazine> magazines, List<Journal> journals, List<Member> members, List<Author> authors, List<Librarian> librarians){
        this.allLiterature = allLiterature;
        this.books = books;
        this.magazines = magazines;
        this.journals = journals;
        this.members = members;
        this.authors = authors;
        this.librarians = librarians;
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

    public List<Journal> getJournals() {
        return journals;
    }

    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public List<Member> getMembers() {
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

    public void setJournals(List<Journal> journals) {
        this.journals = journals;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
