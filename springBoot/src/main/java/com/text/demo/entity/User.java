package com.text.demo.entity;

import java.time.DateTimeException;

public class User {
    private int id;
    private String user_code;
    private String user_name;
    private String user_password;
    private String user_avator;
    private String user_gender;
    private String gmt_create;
    private String locked;
    private String gmt_modify;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_avator() {
        return user_avator;
    }

    public void setUser_avator(String user_avator) {
        this.user_avator = user_avator;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public String getGmt_modify() {
        return gmt_modify;
    }

    public void setGmt_modify(String gmt_modify) {
        this.gmt_modify = gmt_modify;
    }

    public User(int id, String user_code, String user_name, String user_password, String user_avator, String user_gender, String gmt_create, String locked, String gmt_modify) {
        this.id = id;
        this.user_code = user_code;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_avator = user_avator;
        this.user_gender = user_gender;
        this.gmt_create = gmt_create;
        this.locked = locked;
        this.gmt_modify = gmt_modify;
    }
}
