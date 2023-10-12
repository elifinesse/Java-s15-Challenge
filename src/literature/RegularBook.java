package literature;

import java.util.List;
import java.util.TreeSet;

import com.workintech.library.Author;
import com.workintech.library.people.Member;

public class RegularBook extends Book implements Borrowable{
    private List<Member> holders;
    
        public RegularBook(int lib_id, String name, String publicationYear, int copies, boolean isAvailableAsEbook, TreeSet<Author> authors, List<Member> holders) {
        super(lib_id, name, publicationYear, copies, isAvailableAsEbook, authors);
        this.holders = holders;
    }
}
