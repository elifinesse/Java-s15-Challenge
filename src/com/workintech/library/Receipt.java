package com.workintech.library;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.workintech.library.people.MembershipType;

public class Receipt {
    private String fullName;
    private MembershipType membershipType;
    private String bookName;
    private double total;
    private LocalDateTime dateTime;
    private LocalDate dueDate;

    public Receipt(String fullName, MembershipType membershipType, String bookName, double total, LocalDateTime dateTime, LocalDate dueDate){
        this.fullName = fullName;
        this.membershipType = membershipType;
        this.bookName = bookName;
        this.total = total;
        this.dateTime = dateTime;
        this.dueDate = dueDate;
    }

    public String receipt(){
        return "Member: " + fullName + " with membership type: " + membershipType + "\n"
                + "borrowed book: " + bookName + "\n" +
                "Total: " + total + " Date and Time: " + dateTime + "\n" +
                "Due Date: " + dueDate;
    }

}
