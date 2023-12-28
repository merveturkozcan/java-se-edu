package com.merveturk;

// paket her zaman 1. satırda yer alır.

public class Main {
    public static void main(String[] args) {



        // herkesin ortak kullanacğı şeyleri bir class ta tutalım.

        Mudur mudur = new Mudur();
        mudur.setAdi("Helen");
        mudur.setSoyadi("Baysal");
        mudur.setTecrubeYili((byte) 3);
        mudur.setDepartman("Matematik");
        mudur.setTahsilDurumu("Lise");
        mudur.setHesapNo("1234jsjbd");
        System.out.println("Adı Soyadı : " + mudur.getAdi() + " " + mudur.getSoyadi() + " , Tahsil durumu :" + mudur.getTahsilDurumu());
        mudur.getMudurBilgisi(mudur);

        System.out.println("-----------------------");

        mudur.setAdi("Merve");
        mudur.setSoyadi("Özcan");
        mudur.setTecrubeYili((byte) 9);
        mudur.setDepartman("Türkçe");
        mudur.setTahsilDurumu("Master");
        mudur.setHesapNo("111111");
        System.out.println("Adı Soyadı : " + mudur.getAdi() + " " + mudur.getSoyadi() + " , Tahsil durumu :" + mudur.getTahsilDurumu());
        mudur.getMudurBilgisi(mudur);


        System.out.println("--------------------------------------------");


        Hizmetli hizmetli = new Hizmetli();
        hizmetli.setHizmetAlani("Bilişim");
        hizmetli.setHizmetYili((byte)'8');




        hizmetli.getPersonelBilgisi(hizmetli); // üst class bilgileri - personel classı

         /*

         Yukarıdaki bu metod aslında personel classı içinde var ancak hizmetli personeli
         extend ettiğinden içerisine kendi nesnesini alabilir ve kullanabilir.
         Eğer personel dataları set edişmiş olsaydı null gelmezdi veya class içerisinde kontrol sağlanması lazımdı.

         */
        hizmetli.getHizmetliBilgisi(hizmetli); // alt class -hizmetli classı get metodu
        System.out.println(hizmetli); // alt class - hizmetli classı toString metodu çalıştı.





    }
}