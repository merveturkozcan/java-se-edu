package com.merveturk;

public class Mudur extends Personel {
    // Javada sadece 1 class miras alınır.
    // super : miras aldığı sınıfa ait olanlar.

    private byte tecrubeYili;
    private String tahsilDurumu;

    public Mudur() {
    }


    public Mudur(String adi, byte tecrubeYili, String tahsilDurumu) {
        super(adi);
        this.tecrubeYili = tecrubeYili;
        this.tahsilDurumu = tahsilDurumu;
    }

    public Mudur(String adi, String soyadi, String telNo, String kimlikNo, String hesapNo, String departman, byte tecrubeYili, String tahsilDurumu) {
        super(adi, soyadi, telNo, kimlikNo, hesapNo, departman); // bu olmalı ve yeri önemlidir.
        this.tecrubeYili = tecrubeYili;
        this.tahsilDurumu = tahsilDurumu;
    }



    public byte getTecrubeYili() {
        return tecrubeYili;
    }

    public void setTecrubeYili(byte tecrubeYili) {
        this.tecrubeYili = tecrubeYili;
    }

    public String getTahsilDurumu() {
        return tahsilDurumu;
    }

    public void setTahsilDurumu(String tahsilDurumu) {
        this.tahsilDurumu = tahsilDurumu;
    }
}
