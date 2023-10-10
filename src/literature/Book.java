package literature;

import java.util.List;

import com.workintech.library.people.Member;

public class Book extends Literature implements Borrowable{
    private String publishYear;
    private String edition;
    private String isbn;
    private int copies;
    private List<Member> holders;
    private boolean isAvailableAsEbook;
}
