package com.merveturk;

// paket her zaman 1. satırda yer alır.

public class Main {
    public static void main(String[] args) {

        // herkesin ortak kullanacğı şeyleri bir class ta tutalım.

        Mudur mudur = new Mudur();
        mudur.setAdi("Helen");
        mudur.setSoyadi("Baysal");
        mudur.setTecrubeYili((byte)3);
        mudur.setDepartman("Matematik");
        mudur.setTahsilDurumu("Lise");
        mudur.setHesapNo("1234jsjbd");

        System.out.println("Adı Soyadı : " + mudur.getAdi() + " " + mudur.getSoyadi() + " , Tahsil durumu :" + mudur.getTahsilDurumu() );





    }
}