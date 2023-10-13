package com.workintech.library.literature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.people.Author;
import com.workintech.library.people.Member;

public class Book extends Literature implements Borrowable{

    private int copies;
    private boolean isAvailableAsEbook;
    private Set<Author> authors;
    private List<Member> holders;
    private Category category;
    private String author;

    public Book(int lib_id, String name, String author){
        super(lib_id, name);
        this.author = author;
    }

    public Book(int lib_id, String name, int copies, boolean isAvailableAsEbook, Set<Author> authors, List<Member> holders, Category category) {
        super(lib_id, name);
        this.authors = authors;
        if(authors == null){
            authors = new TreeSet<>();
            for(Author author: authors){
                author.addBook(this);
            }
        } else{
            for(Author author: authors){
                author.addBook(this);
            }
        }
        
        if(copies < 0){
            this.copies = 0;
        } else{
            this.copies = copies;
        }
        this.isAvailableAsEbook = isAvailableAsEbook;
        this.holders = holders;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public boolean isAvailableAsEbook() {
        return isAvailableAsEbook;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public List<Member> getHolders() {
        return holders;
    }

    public void addAuthor(Author author){
        if(authors == null){
            authors = new TreeSet<>();
            authors.add(author);
        } else {
            authors.add(author);
        }
    }

    public void checkHolders(){
        if(holders == null){
            holders = new ArrayList<>();
        }
    }
    @Override
    public int compareTo(Literature o) {
        return this.getLib_id() - o.getLib_id();
    }

    @Override
    public String toString() {
        List<Integer> holderIds = new ArrayList<>();
        Set<String> authorNames = new TreeSet<>();
        if(holders == null){
            holders = new ArrayList<>();
        }
        for(Member holder: holders){
            holderIds.add(holder.getId());
        }
        if(authors == null){
            authors = new TreeSet<>();
        }
        for(Author author: authors){
            authorNames.add(author.getFullName());
        }
        return super.toString() +
                "copies=" + copies +
                ", isAvailableAsEbook=" + isAvailableAsEbook +
                ", authors=" + authorNames +
                '}';
    }

    @Override
    public boolean isAvailable() {
        return copies > 0;
    }
}
