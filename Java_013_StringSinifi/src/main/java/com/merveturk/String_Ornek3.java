package com.merveturk;

import java.util.Locale;

public class String_Ornek3 {
    public static void main(String[] args) {
        /*Adımı ve Soyadımı değişken  olarak verdiğimde
          Adımın baş harfi büyük diğerleri küçük iken,soyadım tamamen büyük olsun .
        * ad - merve türk hoca  */

        String ifade ="merve hoca  aaa";
        String ad = ifade.split(" ")[0];
        String soyad = ifade.split(" ")[1].toUpperCase();
        String ilkharf= ad.substring(0,1).toUpperCase(Locale.ROOT);
        ad = ilkharf + ad.substring(1);
        System.out.println(ad+ " " + soyad);
    }
}
