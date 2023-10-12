package literature;

import java.util.TreeSet;

import com.workintech.library.Author;

public class OldBook extends Book{
    private boolean isDelicate;
    
    public OldBook(int lib_id, String name, String publicationYear, int copies, boolean isAvailableAsEbook, TreeSet<Author> authors, boolean isDelicate) {
        super(lib_id, name, publicationYear, copies, isAvailableAsEbook, authors);
        this.isDelicate = isDelicate;
    }

}
