package com.it.pojo;

public class Books {
    private String bname;
    private String author;

    public Books(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Books() {

    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
