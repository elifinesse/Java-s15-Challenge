package literature;

import java.util.TreeSet;

import com.workintech.library.Author;

public abstract class Literature {
    private int lib_id;
    private String name;

    public Literature(int lib_id, String name){
        this.lib_id = lib_id;
        this.name = name;
    }

    public int getLib_id() {
        return lib_id;
    }

    public String getName() {
        return name;
    }

}
