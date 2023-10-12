package literature;

import java.time.LocalDate;
import java.util.Set;

import com.workintech.library.Author;

public class Journal extends Periodical{

    private Set<Author> authors;

    public Journal(int lib_id, String name, LocalDate publicationDate, int volume, int issue, Set<Author> authors) {
        super(lib_id, name, publicationDate, volume, issue);
       this.authors = authors;
    }

}
