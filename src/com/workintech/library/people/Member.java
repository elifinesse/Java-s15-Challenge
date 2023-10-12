package com.workintech.library.people;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.workintech.library.literature.Book;

public class Member extends Person{
    private MembershipType membershipType;
    private List<Book> borrowedBooks;
    private double moneyOwed;
    
    public Member(String id, String fullName, MembershipType membershipType) {
        super(id, fullName);
        this.membershipType = membershipType;
        
    }

    public double calculateBookFee(){
        if(membershipType.name().equals("STUDENT")){
            return 15;
        } else if(membershipType.name().equals("FACULTY")){
            return 10;
        } else if(membershipType.name().equals("SENIOR")){
            return 20;
        } else if(membershipType.name().equals("REGULAR")){
            return 30;
        } else{
            return 0;
        }
    }
    
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public double getMoneyOwed() {
        return moneyOwed;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public void setMoneyOwed(double moneyOwed) {
        this.moneyOwed = moneyOwed;
    }

    public void checkBorrowedBooks(){
        if(borrowedBooks == null){
            borrowedBooks = new ArrayList<Book>();
        }
    }

    public void borrowBook(Book book){
        checkBorrowedBooks();
        if(borrowedBooks.size() < 5 && book.getCopies() > 0){
            borrowedBooks.add(book);
            book.setCopies(book.getCopies() - 1);
            book.checkHolders();
            book.getHolders().add(this);
            moneyOwed = moneyOwed + calculateBookFee();
        } else if(borrowedBooks.size() == 5){
            System.out.println("You cannot borrow more than 5 books.");
        } else{
            System.out.println("There are no copies available to borrow.");
        }
    }

   

    public void returnBook(Book book){
       Iterator<Book> iterator = borrowedBooks.iterator();
       while(iterator.hasNext()){
        if(iterator.next().equals(book)){
            iterator.remove();
        }
       }
        book.setCopies(book.getCopies() + 1);
        moneyOwed = moneyOwed - calculateBookFee();
    }

    @Override
    public String toString() {
        List<String> bookNames = new ArrayList<>();
        for(Book book: borrowedBooks){
            bookNames.add(book.getName());
        }
        return super.toString() +
                "membershipType=" + membershipType +
                ", borrowedBooks=" + bookNames +
                ", moneyOwed=" + moneyOwed +
                '}';
    }
}
