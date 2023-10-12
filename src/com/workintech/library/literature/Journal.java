package com.workintech.library.literature;

import java.time.LocalDate;
import java.util.Set;

import com.workintech.library.Author;
import com.workintech.library.people.Member;

public class Journal extends Periodical{

    private Set<Author> authors;
    private boolean isPhysicalCopyAvailable;

    public Journal(int lib_id, String name, LocalDate publicationDate, int volume, int issue, Set<Author> authors) {
        super(lib_id, name, publicationDate, volume, issue);
       this.authors = authors;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public String toString() {
        return super.toString() +
                "authors=" + authors +
                ", isPhysicalCopyAvailable=" + isPhysicalCopyAvailable +
                '}';
    }
}
