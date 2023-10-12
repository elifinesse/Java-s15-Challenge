package literature;

import java.util.TreeSet;

import com.workintech.library.Author;

public class Book extends Literature{
    private String publicationYear;
    private int copies;
    private boolean isAvailableAsEbook;
    private TreeSet<Author> authors;

    public Book(int lib_id, String name, String publicationYear, int copies, boolean isAvailableAsEbook, TreeSet<Author> authors) {
        super(lib_id, name);
        this.authors = authors;
        this.publicationYear = publicationYear;
        this.copies = copies;
        this.isAvailableAsEbook = isAvailableAsEbook;
        this.authors = authors;

    }
}
