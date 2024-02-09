package com.example.form;

public class UserForm {

    private String name;
    private int age;
    private String comment;
    
    @Override
    public String toString() {
        return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    
    
    
}
