package com.example.moody.acitivity;

public class Model {

    private String desc,time;
    private int img;

    public Model(String desc, String time, int img) {
        this.desc = desc;
        this.time = time;
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public String getTime() {
        return time;
    }

    public int getImg() {
        return img;
    }
}
