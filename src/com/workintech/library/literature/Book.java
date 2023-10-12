package literature;

import java.util.List;
import java.util.TreeSet;

import com.workintech.library.Author;
import com.workintech.library.people.Member;

public class Book extends Literature{

    private int copies;
    private boolean isAvailableAsEbook;
    private TreeSet<Author> authors;
    private List<Member> holders;

    public Book(int lib_id, String name, int copies, boolean isAvailableAsEbook, TreeSet<Author> authors, List<Member> holders) {
        super(lib_id, name);
        this.authors = authors;
        this.copies = copies;
        this.isAvailableAsEbook = isAvailableAsEbook;
        this.authors = authors;
    }

    public int getCopies() {
        return copies;
    }

    public boolean isAvailableAsEbook() {
        return isAvailableAsEbook;
    }

    public TreeSet<Author> getAuthors() {
        return authors;
    }

    public List<Member> getHolders() {
        return holders;
    }

    
    @Override
    public int compareTo(Literature o) {
        return this.getLib_id() - o.getLib_id();
    }
}
