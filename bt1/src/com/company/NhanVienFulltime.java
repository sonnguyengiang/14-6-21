package com.company;

import com.company.NhanVien;

public class NhanVienFulltime extends NhanVien {
    private int tienthuong;
    private int sotienphat;
    private int luongcung;

    public NhanVienFulltime() {

    }
    public NhanVienFulltime(int tienthuong, int sotienphat, int luongcung, int id, String name, int age, int phonenumber, String email) {
        super(id, name, age, phonenumber, email);
        this.tienthuong = tienthuong;
        this.sotienphat = sotienphat;
        this.luongcung = luongcung;
    }

    public NhanVienFulltime(int tienthuong, int sotienphat, int luongcung) {
        this.tienthuong = tienthuong;
        this.sotienphat = sotienphat;
        this.luongcung = luongcung;
    }

    public int getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(int tienthuong) {
        this.tienthuong = tienthuong;
    }

    public int getSotienphat() {
        return sotienphat;
    }

    public void setSotienphat(int sotienphat) {
        this.sotienphat = sotienphat;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }
}
