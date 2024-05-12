package main.java.entities;

import java.io.Reader;

public class User {
    private Integer record;
    private String name;
    private String email;
    private String Password;
    public User(Integer record, String name, String email, String password) {
        this.record = record;
        this.name = name;
        this.email = email;
        Password = password;
    }
    public Integer getRecord() {
        return record;
    }
    public void setRecord(Integer record) {
        this.record = record;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
