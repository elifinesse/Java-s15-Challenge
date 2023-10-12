package literature;

import java.time.LocalDate;

public class Periodical extends Literature implements MembershipAvailable{
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
    
}