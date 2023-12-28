package com.merveturk;

import java.util.SplittableRandom;

public class Personel {

    private String adi;
    private String soyadi;
    private String telNo;
    private String kimlikNo;
    private String hesapNo;
    private String departman;


    public Personel() {

    }

    public Personel(String adi) {
        this.adi = adi;
    }

    public Personel(String adi, String soyadi, String telNo, String kimlikNo, String hesapNo, String departman) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.telNo = telNo;
        this.kimlikNo = kimlikNo;
        this.hesapNo = hesapNo;
        this.departman = departman;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
