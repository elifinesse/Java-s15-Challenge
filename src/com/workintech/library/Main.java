package com.workintech.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.literature.Book;
import com.workintech.library.literature.Category;
import com.workintech.library.literature.Journal;
import com.workintech.library.literature.Magazine;
import com.workintech.library.literature.Periodical;
import com.workintech.library.people.Author;
import com.workintech.library.people.Librarian;
import com.workintech.library.people.Member;
import com.workintech.library.people.MembershipType;
import com.workintech.library.people.Person;

public class Main {
    public static void main(String[] args) {
        Person member1 = new Member(1, "Roy, Logan", MembershipType.SENIOR);
        Person member2 = new Member(2, "Roy, Kendall", MembershipType.STUDENT);
        Person member3 = new Member(3, "Roy, Shiv", MembershipType.FACULTY);
        Person member4 = new Member(4, "Roy, Roman", MembershipType.STUDENT);
        Person member5 = new Member(5, "Roy, Connor", MembershipType.REGULAR);

        Author author1 = new Author(123, "Shakespeare, William", null);
        Author author2 = new Author(234, "Woolf, Virginia", null);
        Author author3 = new Author(246, "Tolkien, J.R.R", null);
        Author author4 = new Author(247, "Herman, Edward S.", null);
        Author author5 = new Author(248, "Chomsky, Noam", null);

        Set<Author> authors = new TreeSet<>();
        authors.add(author4); 
        authors.add(author5);
        Set<Author> klAuthor = new TreeSet<>();
        klAuthor.add(author1);
        Set<Author> mdAuthor = new TreeSet<>();
        mdAuthor.add(author2);
        Set<Author> lotrAuthor = new TreeSet<>();
        lotrAuthor.add(author3);
        Book book1 = new Book(12, "King Lear", 3, false, klAuthor, null, Category.DRAMA);
        Book book2 = new Book(15, "Mrs. Dolloway", 2, true, mdAuthor, null, Category.FICTION);
        Book book3 = new Book(17, "The Fellowship of the Ring", 4, true, lotrAuthor, null, Category.FICTION);
        Book book4 = new Book(18, "The Two Towers", 4, true, lotrAuthor, null, Category.FICTION);
        Book book5 = new Book(19, "The Return of the King", 4, true, lotrAuthor, null, Category.FICTION);
        Book book6 = new Book(20, "Manufacturing Consent", 2, false, authors, null, Category.REFERENCE);

        Set<Author> journalAuthors = new TreeSet<>();
        journalAuthors.add(author2);
        journalAuthors.add(author3);
        journalAuthors.add(author5);

        Periodical journal = new Journal(1, "English Lit", LocalDate.of(2023,10, 01), 20, 10, journalAuthors, true);
        Periodical magazine = new Magazine(2, "17th Century", LocalDate.of(1616, 04, 26), 10, 4, false);
        List<Book> borrowedbooks = new ArrayList<>();
        borrowedbooks.add(book1); 
        ((Member)member1).borrowBook(book1);

        List<Book> allBooks = new ArrayList<>();
        allBooks.add(book6);
        allBooks.add(book5);
        allBooks.add(book4);
        allBooks.add(book3);
        allBooks.add(book2);
        allBooks.add(book1);

        List<Periodical> allJournals = new ArrayList<>();
        allJournals.add(journal);

        List<Periodical> allMagazines = new ArrayList<>();
        allMagazines.add(magazine);

        Librarian librarian = new Librarian(1, "Some, Librarian", "123abc");
        Book book7 = new Book(25, "Hamlet", 4, false, klAuthor, null, Category.DRAMA);

        List<Author> allAuthors = new ArrayList<>();
        allAuthors.add(author1);
        allAuthors.add(author2);
        allAuthors.add(author3);
        allAuthors.add(author4);
        allAuthors.add(author5);
        
        
        Library library = new Library(allBooks, allMagazines, allJournals, null, allAuthors, null);

        librarian.addBook(library, book7);
        System.out.println(library.getBooks().size());
        librarian.removeBook(library, book5);
        librarian.removeBook(library, book5);
        librarian.removeBook(library, book5);
        librarian.removeBook(library, book5);
      
        System.out.println(librarian.findLiterature(library, 2, "TOLKIEN"));
    }
}
