package com.it.pojo;


import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;
    private String uname;
    private String pwd;
    private IDCard idCard;
    public User() {

    }

    public User(String uname) {
    }

    public User(String uname, String id) {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", idCard=" + idCard +
                '}';
    }

    public User(int id, String uname, String pwd) {
        this.id = id;
        this.uname = uname;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}
