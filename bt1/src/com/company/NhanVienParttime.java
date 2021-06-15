package com.company;

import com.company.NhanVien;

public class NhanVienParttime extends NhanVien {
    private int sogiolam;
    public NhanVienParttime() {

    }
    public NhanVienParttime(int sogiolam, int id, String name, int age, int phonenumber, String email) {
        super(id, name, age, phonenumber, email);
        this.sogiolam = sogiolam;
    }

    public NhanVienParttime(int sogiolam) {
        this.sogiolam = sogiolam;
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }
}
