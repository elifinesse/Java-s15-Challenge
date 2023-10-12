package com.workintech.library.people;

import java.util.List;

import com.workintech.library.literature.Book;

public class Member extends Person{
    private MembershipType membershipType;
    private List<Book> borrowedBooks;
    private double moneyOwed;
    
    public Member(String id, String fullName, MembershipType membershipType) {
        super(id, fullName);
        this.membershipType = membershipType;
    }
}
