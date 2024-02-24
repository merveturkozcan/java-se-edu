package com.merveturk;

public class String_Contains {
    /*
    *Bir makale isteniz var ve insanlar içerik üretiyorlar yorum yapıyorlar Burada tüm içerikleri yayınlamadan
    * önce otomatik olarak kontrol etmemiz zorlşır. Çünkü günde 10000 makale yayınlandığını düşünürsek bunları incelemek okumak
    * uzun zaman alacaktır.
    *
    * 1- Uygunsuz İçerik kontrolü yapılmalıdır. Bu uygunsuz makaleler manuel olarak gözden gecirilmeli ve onay red almalıdır.
    *
    * Tüm bu işlemleri yaparken Contains metodunu kullanmamız işimize yarayacaktır.
    *
    * */
    public static void main(String[] args) {
        String ifade = "bugün merve string ifade ile alakalı dersleri bitirdi.";
        System.out.println("merve var mı ? " + ifade.contains("merve")); // true
        System.out.println("   merve  var mı ? " + ifade.contains("    merve")); // false

        /*
        *  Arama yapılan String ifade içinde belli bir ifade ile başlıyorsa yada bitiyorsa true/false dönen kullanımlar için
        * .stratWith()
        * .endWith()
        */


        /* Elimizde stok listesi olsun bu liste içinden monitör ürünlerini ayırmak istediğimizi düşünelim.
        * STKPC4433 , STKPC4431 ,STKMN1212 ,STKMN12332 ,STKMN18999 */

        String stok1="STKPC4433", stok2="STKPC4431", stok3="STKMN12332";
        System.out.println("Stok1 monitör mü ? " + stok1.startsWith("STKMN"));
        System.out.println("Stok3 monitör mü ? " + stok3.startsWith("STKMN"));

        /* Elimizde dosya listesi var ve biz sadece java dosyalarını ayıklamak istiyoruz .*/

        String dosya1="düğün.pm4", dosya2="donguler.java";
        System.out.println("Dosya1 monitör mü ? " + dosya1.endsWith("java"));
        System.out.println("Dosya2 monitör mü ? " + dosya2.endsWith("java"));





    }
}
