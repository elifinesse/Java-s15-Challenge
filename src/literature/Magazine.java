package literature;

import java.time.LocalDate;

public class Magazine extends Periodical{
    private boolean isAvailableAsEMagazine;

     public Magazine(int lib_id, String name, LocalDate publicationDate, int volume, int issue, boolean isAvailableAsEMagazine) {
        super(lib_id, name, publicationDate, volume, issue);
        this.isAvailableAsEMagazine = isAvailableAsEMagazine;
    }
    
}
