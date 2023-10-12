package com.workintech.library.people;

import java.util.Objects;

public abstract class Person implements Comparable<Person>{
    private String id;
    private String fullName;

    public Person(String id, String fullName){
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public int compareTo(Person person) {
        return fullName.compareTo(person.fullName);
    }
    
}