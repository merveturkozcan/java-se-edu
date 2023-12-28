package com.merveturk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.SplittableRandom;

@Getter
@Setter
@NoArgsConstructor  // boş parametreli kurucu metod ekler lombok
@AllArgsConstructor  // tüm parametreler dahil kurucu metod ekler.
public class Personel {

    private String adi;
    private String soyadi;
    private String telNo;
    private String kimlikNo;
    private String hesapNo;
    private String departman;

    public void getPersonelBilgisi(Personel personel) {
        System.out.println(" Personel Adı Soyadı :" + personel.getAdi() + " " + personel.getSoyadi()
                         + " Telefon No : " + personel.getTelNo()
                         + " Kimlik No : "  + personel.getKimlikNo()
                         + " Hesap No : "   + personel.getHesapNo()
                         + " Departmanı : " + personel.getDepartman());
    }

}
