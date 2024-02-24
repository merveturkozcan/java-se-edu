package com.merveturk.dosyaKaynakYapisi;

// publıc sınıf kendı ısmıne aıt olan dosyada tanımlanmalıdır.
// her java kaynak kodu dosyasında en fazla 1 tane publıc sınıf olabılır.
// hıc publıc sınıf olmadan da java dosyası derlenebılır ancak tercıh edılmez.
// aslında dosya adını nerden alır dıye dusunursek ; maın metodu bulunan publıc sınıftan dıyebılırız .

/* bır java  dosyası içerisinde sadece 1 adet public
class bulunabilir. Eğer 1 dosya içerisinde birden
fazla public class tanımlamak istiyorsanız en dışa Parent bir class
oluşturup oluşturmak istediğiniz diğer sınıfları bu
sınıfın alt public static class'ı olarak tanımlayabilirsiniz.*/



public class Main {
    public static void main(String[] args) {
        Selam selamTest = new Selam();
        selamTest.word="Merve";
        System.out.println(selamTest.selamSoyle("Ali"));

        }
    }


    // 2. bir class mevcut olabilir ancak public olamaz.
 class Selam {
    String word = " Merhaba ben Selam Classından geliyorum";

    public String selamSoyle (String kime){
        String cumle;
        if(kime != " ")
            cumle= ("Selam " + kime );
        else
            cumle= ("Selam "+ word);

        return cumle;
    }

}
