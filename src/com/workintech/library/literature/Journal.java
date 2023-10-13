package com.workintech.library.literature;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

import com.workintech.library.people.Author;
import com.workintech.library.people.Member;

public class Journal extends Periodical{

    private Set<Author> authors;
    private boolean isPhysicalCopyAvailable;

    public Journal(int lib_id, String name, LocalDate publicationDate, int volume, int issue, Set<Author> authors, boolean isPhysicalCopyAvailable) {
        super(lib_id, name, publicationDate, volume, issue);
       this.authors = authors;
       this.isPhysicalCopyAvailable = isPhysicalCopyAvailable;
    }

    public Set<Author> getAuthors() {
        return authors;
    }
    
    public boolean isPhysicalCopyAvailable() {
        return isPhysicalCopyAvailable;
    }

    @Override
    public String generatePassword(Member member) {
        return "Your password is: " + getLib_id() + member.getId();
    }

    @Override
    public String findPhysicalCopy() {
        if(isPhysicalCopyAvailable){
            return "Please go to the Periodicals section of the library.";
        } else{
            return "This journal is only available online.";
        }
    }

    @Override
    public int compareTo(Literature o) {
        return getLib_id() - o.getLib_id();
    }

    @Override
    public String toString() {
        if(authors == null){
            authors = new TreeSet<>();
        }
        Set<String> authorNames = new TreeSet<>();
        for(Author author: authors){
            authorNames.add(author.getFullName());
        }
        return super.toString() +
                "authors=" + authorNames +
                ", isPhysicalCopyAvailable=" + isPhysicalCopyAvailable +
                '}';
    }
}
