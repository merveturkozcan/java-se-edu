package com.merveturk;

public class MetodTanimlama {
    public static void main(String[] args) {

        // metodlarınHepsi emir cümlesidir ve genelde önüne get sözcüğü gelir .
        // getHesapKapat gibi. Metodlar davranışı belirler.
        // static metod doğrudan çağırabilirim demektir ancak her seferinde cağrıldığından maliyeti yüksektir.
        // Eğer elimizde nesne yoksa ilk durumlarda mesela o zaman static kullanmak mantıklıdır.
        // Direkt olarak bellekten Çağırır. Eğer static kullanmak istemiyorsan bulunduğun
        // Class içerisinde bir obj nesnesi oluşturup o class içerisindeki metodlara ulaşabilirsin.

        System.out.println("Kare Al : " + kareAl(5,2));
        System.out.println("Toplama : " + topla(2,5,9));

    }

    private static int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1+sayi2+sayi3;
    }

    private static double kareAl(double taban, double us) {
        return Math.pow(taban,us);
    }
}