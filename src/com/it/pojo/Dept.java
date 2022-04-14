package com.it.pojo;

public class Dept {
    private String dname;

    public Dept() {

    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public Dept(String dname) {
        this.dname = dname;
    }
}
