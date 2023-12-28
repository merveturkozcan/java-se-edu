package com.merveturk;

public class Main {
    public static void main(String[] args) {

        Arac arac = new Arac();
        System.out.println(arac);
        arac.hareketEt();

        /*

         Composition (Kompozisyon, Birleşim) : Sınıfları bir başka sınıf içerisinde bir araya getirmek.

          Belli bir amaç için yazılmış ve doğruluğu kanıtlanmış olan sınıfları,
          yeni uygulamaların içerisinde kullanmak hem iş süresini kısaltacaktır
          hem de yeni yazılan uygulamalarda hata çıkma riskini en aza indirgeyecektir.
          Uygulamalarımızda daha evvelden yazılmış ve doğruluğu kanıtlanmış olan sınıfları
          tekrardan kullanmanın iki yöntemi bulunur.

          Birinci yöntem kalıtımdır (inheritance). Bu yöntemde yeni oluşturacağımız sınıf,
          daha evvelden yazılmış ve doğruluğu kanıtlanmış olan sınıftan türetilir;
          böylece yeni oluşan sınıf, türetildiği sınıfın özelliklerine ve işlevlerine sahip olur;
          Ayrıca oluşan bu yeni sınıfın kendisine ait yeni özellikleri ve işlevleri de olabilir.

          İkinci yöntem ise komposizyon’dur. Bu yöntem sayesinde daha önceden yazılmış ve doğruluğu
          kanıtlanmış olan sınıf/sınıfları, yeni yazılan sınıfın içerisinde doğrudan kullanabilme
          şansına sahip oluruz.

 */


    }
}