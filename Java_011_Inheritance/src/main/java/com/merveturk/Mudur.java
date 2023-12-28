package com.merveturk;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mudur extends Personel {
    // Javada sadece 1 class miras alınır.
    // super : miras aldığı sınıfa ait olanlar.

    private byte tecrubeYili;
    private String tahsilDurumu;

    public Mudur() {}  // lombok ile @NoArgsConstructor yazdığında bu metodu ekler.

    public Mudur(String adi, String soyadi, String telNo, String kimlikNo, String hesapNo, String departman, byte tecrubeYili, String tahsilDurumu) {
        super(adi, soyadi, telNo, kimlikNo, hesapNo, departman); // bu olmalı ve yeri önemlidir.
        this.tecrubeYili = tecrubeYili;
        this.tahsilDurumu = tahsilDurumu;
    }  // lombok ile @AllArgsConstructor yazdığında bu metodu ekler.

    public void getMudurBilgisi(Mudur mudur) {
        System.out.println(" Tecrübe Yılı : "   + mudur.getTecrubeYili()
                + " Tahsil Durumu : " + mudur.getTahsilDurumu()

        );
    }

}
