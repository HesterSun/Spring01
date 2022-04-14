package com.it.pojo;

public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public Emp() {

    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Emp(String ename, String gender, Dept dept) {
        this.ename = ename;
        this.gender = gender;
        this.dept = dept;
    }
}
