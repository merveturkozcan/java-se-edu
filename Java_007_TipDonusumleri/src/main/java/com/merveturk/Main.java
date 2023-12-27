package com.merveturk;

public class Main {
    public static void main(String[] args) {

        byte yas1= 10 ;  //byte size: 127
        short yas2=200;  // 32767
        byte toplam= (byte) (yas1+yas2);
        System.out.println(toplam);
        // burada sonuc -46 çıktı neden ?
        // çünkü ys1 ve 2 nin toplamı byte boyutunu aşıyor.

        int toplam2 =(yas1+yas2);
        System.out.println(toplam2);

        /*
        *   byte + byte = int
        *   short + short = int
        *   byte + short = int
        *   int + int = int
        *
        *
        *
        * float veri tipi 6 basamak hassasiyet sağlar 7. karakteri yuvarlar.
        *
        * */

        int deger1= 2145626;
        int deger2= 2000000000;
        int toplam3= deger1+deger2;
        System.out.println(toplam3);


        float piSayisi= 3.14f;
        double bankaHesabi= 12.87877666767f;  // şeklinde tanımlanabilir. optional
        long hesapBilgisi = 100_000_000L;  // Bu okunaklı olması için kullanılır buna literal denir.

        // çalışır mı ? evet
        float sayimiz1= 1;
        double sayimiz2= 1;
        double sonuc=sayimiz1+sayimiz2;
        System.out.println(sonuc);

        // çalışır mı ? hata alırız virgüllü float sayılarda f konulmalıdır.
        float sayimiz3= 1.0;  // 1.0f; doğrusudur.
        double sayimiz4= 1.0;  // (float) 1.0  da olabilir.
        double sonuc2=sayimiz3+sayimiz4;
        System.out.println(sonuc2);






















    }
}