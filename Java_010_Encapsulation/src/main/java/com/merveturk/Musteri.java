package com.merveturk;

public class Musteri {

    private String adi;
    private String soyadi;
    private Long hesapNo;
    private Double hesapCuzdani;

    // değişkenler private olur ama getter setter public oldugundan kullanırız.
    // public herkes erişir. başka paketler dhil.
    // protected sadece miras alan kullanır.
    //

    public Musteri() {
        System.out.println("bos parametreli kurucu");
    }

    public Musteri(String adi, String soyadi, Long hesapNo, Double hesapCuzdani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.hesapNo = hesapNo;
        this.hesapCuzdani = hesapCuzdani;

        System.out.println("parametreli kurucu");
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

    public Long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(Long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public Double getHesapCuzdani() {
        return hesapCuzdani;
    }

    public void setHesapCuzdani(Double hesapCuzdani) {
        this.hesapCuzdani = hesapCuzdani;
    }
}
