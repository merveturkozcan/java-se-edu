package com.merveturk;

public class Hizmetli extends Personel {
    // Javada sadece 1 class miras alınır. Ve eğer miras alıyorsan kurucu metodların içerisinde
    // önce super sınıfa ait değişkenleri koyarsın sonra kendisine ait olanları eklersin.
    // super(adi, soyadi, telNo, kimlikNo, hesapNo, departman);

    private String hizmetAlani;
    private Byte hizmetYili;


    public Hizmetli() {
    }

    public Hizmetli(String adi, String hizmetAlani, Byte hizmetYili) {
        super(adi);
        this.hizmetAlani = hizmetAlani;
        this.hizmetYili = hizmetYili;
    }

    public Hizmetli(String adi, String soyadi, String telNo, String kimlikNo, String hesapNo, String departman, String hizmetAlani, Byte hizmetYili) {
        super(adi, soyadi, telNo, kimlikNo, hesapNo, departman);

        this.hizmetAlani = hizmetAlani;
        this.hizmetYili = hizmetYili;
    }





}
