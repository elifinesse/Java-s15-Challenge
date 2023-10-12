package com.workintech.library.literature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.workintech.library.people.Author;
import com.workintech.library.people.Member;

public class Book extends Literature implements Borrowable{

    private int copies;
    private boolean isAvailableAsEbook;
    private Set<Author> authors;
    private List<Member> holders;
    private Category category;

    public Book(int lib_id, String name, int copies, boolean isAvailableAsEbook, Set<Author> authors, List<Member> holders, Category category) {
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

    public List<Member> getHolders() {
        return holders;
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
        List<String> holderIds = new ArrayList<>();
        for(Member holder: holders){
            holderIds.add(holder.getId());
        }
        return super.toString() +
                "copies=" + copies +
                ", isAvailableAsEbook=" + isAvailableAsEbook +
                ", authors=" + authors +
                '}';
    }

    @Override
    public boolean isAvailable() {
        return copies > 0;
    }
}
