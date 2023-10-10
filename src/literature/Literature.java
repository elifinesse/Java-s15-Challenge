package literature;

import java.util.TreeSet;

import com.workintech.library.Author;

public abstract class Literature {
    private int lib_id;
    private String name;
    private int copies;
    private TreeSet<Author> contributers;
}
