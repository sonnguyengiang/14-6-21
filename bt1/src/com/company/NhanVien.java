package com.company;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private int phonenumber;
    private String email;

    public NhanVien()  {

    }
    public NhanVien(int id, String name, int age, int phonenumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class Main {

        public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        }
    }
}
