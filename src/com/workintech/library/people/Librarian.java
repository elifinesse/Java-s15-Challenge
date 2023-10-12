package com.workintech.library.people;


public class Librarian extends Person{

    private String password;

    public Librarian(String id, String fullName, String password) {
        super(id, fullName);
        this.password = password;
    }
   
}
