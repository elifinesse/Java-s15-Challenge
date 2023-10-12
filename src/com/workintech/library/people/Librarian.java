package com.workintech.library.people;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.Library;
import com.workintech.library.literature.Book;
import com.workintech.library.literature.Category;

public class Librarian extends Person{

    private String password;

    public Librarian(String id, String fullName, String password) {
        super(id, fullName);
        this.password = password;
    }

    public void addBook(Library library, Book book){
        if(library.getBooks().contains(book)){
            book.setCopies(book.getCopies() + 1);
        } else{
            library.getBooks().add(book);
        }
    }

    public void removeBook(Library library, Book book){
        if(book.getCopies() > 1){
            book.setCopies(book.getCopies() - 1);
        } else{
            Iterator<Book> iterator = library.getBooks().iterator();
            while(iterator.hasNext()){
                if(iterator.next().equals(book)){
                    iterator.remove();
                }
            }
        }
    }

    public Set<Book> listBooksByCategory(Library library, Category category){
        Set<Book> sameCategory = new TreeSet<>();
        for(Book book: library.getBooks()){
            if(book.getCategory().equals(category)){
                sameCategory.add(book);
            }
        }
        return sameCategory;
    }

    public Set<Book> listBooksByAuthor(Library library, Author author){
        return author.getBooks();
    }

    @Override
    public String toString() {
        return super.toString() +
                "password='" + password + '\'' +
                '}';
    }
}
