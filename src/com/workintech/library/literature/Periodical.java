package com.workintech.library.literature;

import java.time.LocalDate;

public abstract class Periodical extends Literature implements MembershipAvailable{
    private LocalDate publicationDate;
    private int volume;
    private int issue;

    public Periodical(int lib_id, String name, LocalDate publicationDate, int volume, int issue) {
        super(lib_id, name);
        this.publicationDate = publicationDate;
        this.volume = volume;
        this.issue = issue;
    }
    public int getIssue() {
        return issue;
    }
    public int getVolume() {
        return volume;
    }
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "publicationDate=" + publicationDate +
                ", volume=" + volume +
                ", issue=" + issue + ", ";
    }
}