package com.workintech.library;

import java.util.List;

import com.workintech.library.people.Author;
import com.workintech.library.people.Member;
import com.workintech.library.literature.Book;
import com.workintech.library.literature.Journal;
import com.workintech.library.literature.Literature;
import com.workintech.library.literature.Magazine;

public class Library {
    private List<Literature> allLiterature;
    private List<Book> books;
    private List<Magazine> magazines;
    private List<Journal> journals;
    private List<Member> members;
    private List<Author> authors;
}
