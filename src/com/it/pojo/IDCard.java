package com.it.pojo;

public class IDCard {
    private int id;
    private String code;

    @Override
    public String toString() {
        return "IDCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
