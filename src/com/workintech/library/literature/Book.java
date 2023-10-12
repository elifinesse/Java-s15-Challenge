package com.workintech.library.literature;

import java.util.List;
import java.util.Set;

import com.workintech.library.people.Author;
import com.workintech.library.people.Member;

public class Book extends Literature implements Borrowable{

    private int copies;
    private boolean isAvailableAsEbook;
    private Set<Author> authors;
    private List<Member> holders;

    public Book(int lib_id, String name, int copies, boolean isAvailableAsEbook, Set<Author> authors, List<Member> holders) {
        super(lib_id, name);
        this.authors = authors;
        for(Author author: authors){
            author.addBook(this);
        }
        if(copies < 0){
            this.copies = 0;
        } else{
            this.copies = copies;
        }
        this.isAvailableAsEbook = isAvailableAsEbook;
        this.holders = holders;
    }

    public int getCopies() {
        return copies;
    }

    public boolean isAvailableAsEbook() {
        return isAvailableAsEbook;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public List<Member> getHolders() {
        return holders;
    }

    
    @Override
    public int compareTo(Literature o) {
        return this.getLib_id() - o.getLib_id();
    }

    @Override
    public String toString() {
        return super.toString() +
                "copies=" + copies +
                ", isAvailableAsEbook=" + isAvailableAsEbook +
                ", authors=" + authors +
                ", holders=" + holders +
                '}';
    }

    @Override
    public boolean isAvailable() {
        return copies > 0;
    }
}
