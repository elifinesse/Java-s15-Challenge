package literature;

import java.time.LocalDate;

import com.workintech.library.people.Member;

public class Magazine extends Periodical{
    private boolean isAvailableAsEMagazine;

     public Magazine(int lib_id, String name, LocalDate publicationDate, int volume, int issue, boolean isAvailableAsEMagazine) {
        super(lib_id, name, publicationDate, volume, issue);
        this.isAvailableAsEMagazine = isAvailableAsEMagazine;
    }

    @Override
    public String generatePassword(Member member) {
        if(isAvailableAsEMagazine){
        return "Your password is: " + getLib_id() + member.getId();
        } else {
            return "This magazine is only available as a physical copy.";
        }
    }

    public boolean isAvailableAsEMagazine() {
        return isAvailableAsEMagazine;
    }

    @Override
    public String findPhysicalCopy() {
        return "Please go to the Periodicals section of the library.";
    }

    @Override
    public int compareTo(Literature o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
