package com.workintech.library.literature;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Literature journal = new Journal(2, "hi", LocalDate.of(2020, 1, 8), 2, 1, null);
        Book book = new Book(1, "abc", 1, false, null, null);
        Book book2 = new Book(1, "aedf", 2, false, null, null);
        System.out.println(book.equals(book2));
        System.out.println(book);
        System.out.println(journal);
    }
}
