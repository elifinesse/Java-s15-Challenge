package com.workintech.library.literature;


import java.util.Objects;

public abstract class Literature implements Comparable<Literature>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Literature that = (Literature) o;
        return lib_id == that.lib_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lib_id);
    }

    @Override
    public String toString() {
        return "Literature{" +
                "lib_id=" + lib_id +
                ", name='" + name + "', ";
    }
}
