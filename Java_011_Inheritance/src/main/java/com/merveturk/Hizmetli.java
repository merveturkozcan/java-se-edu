package com.merveturk;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor  // boş parametreli kurucu metod ekler lombok
@AllArgsConstructor  // tüm parametreler dahil kurucu metod ekler.
@ToString // Class içerisindeki dataların son durumunu görmek için kullanabiliriz.


public class Hizmetli extends Personel {
    // Javada sadece 1 class miras alınır. Ve eğer miras alıyorsan kurucu metodların içerisinde
    // önce super sınıfa ait değişkenleri koyarsın sonra kendisine ait olanları eklersin.
    // super(adi, soyadi, telNo, kimlikNo, hesapNo, departman);

    private String hizmetAlani;
    private Byte hizmetYili;

    public void getHizmetliBilgisi(Hizmetli hizmetli) {
        System.out.println(" Hizmet Alanı : "   + hizmetli.getHizmetAlani()
                + " Hizmet Yılı : " + hizmetli.getHizmetYili() );
    }
}
