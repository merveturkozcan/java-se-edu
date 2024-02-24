package com.merveturk;

public class Runner {
    //Asagidaki kod parcasinda hangi degiskenler stack de , hangileri heap de tanimlanir yaziniz.
    public static void main(String[] args) {
        Car car1 = new Car(); // car1 stack de olusur cunku bakildiginda main metodunda bulunan local variable idir.
        car1.make = "mercedes"; // heapte olusur. cunku make nesnenin field alanidir.
        car1.model= "C200"; // heap cunku model nesnenin field alanidir.
        car1.year= "2019"; // heap cunku year nesnenin field alanidir.
        car1.distance =0; // heap cunku distance nesnenin field alanidir.
        car1.speed=0; // heap cunku speed nesnenin field alanidir.
        int carSpeed = car1.speed; // carSpeed stackde olusur
    }
}

/*
 * Degisken Tipleri ;
 * 1- Nesne Degiskenleri :(Instance ya da Object Variable) ;
 * Nesnenin durumunu olusturan degiskenlerdir . Ornegin class a ait ozelliklerdir.
 *
 * 2-Sinif Degiskenleri (Class Variable) :
 * Nesnelerin ortak durumunu ifade eden degiskenlerdir .
 *
 * 3-Yerel Degiskenler (Local Variable): Gecici Degiskenler.
 * Ornegin Class icerisinde tanimlanan metodlarin parametrelerindeki degiskenler birer Local degiskendir.
 */


/*
 * Heap ve Stack
 * Calisma zamaninda kullanilan 2 farkli bellek alanidir. JVM bu alanlari isletim sisteminden tahsis eder.
 *
 * Heap (Dynamic Memory) : Jvm tarafindan nesne olusturmak icin kullanilan bellek alanidir. Nesneler hep de olusur.
 *
 * Stack : O anda programda calisan aktif metodlar icin tutulan bellektir. Bunu ust uste dizilmis tabaklar gibi dusunebiliriz.
 * LIFO mantigi ile calisir. Javada stack da daima ilk olarak main frame i acilir. Ilk calisan metod main metodu oldugundan oturu.
 *  Yerel Degiskenler ve Stack :
 * Eger uye degiskenler ise heap te bulunurlar , aksine bir metod da olusan local variable iseler tipinden bagimsiz stack de bulunurlar.
 *
 *
 * Bir degiskenin primitive olmasi yada Referance olmasi,  bellekte nerede tutuldugunu gostermez .
 * Nesnenin parcasi ise yani class icinde tanimlanan field alanlar ise Heap
 * Nesnenin parcasi degil local variable ise stack de olusur.
 *
 * */

/*
 *  Yerel degiskenlere asagidaki isimler de verilir ;
 *  1- Stack Variables ; Bu degiskenler stack de olusur . Ancak nesneler heap de olusur demistik.
 *  2- Temporary(gecici) Variable : Cunku Local degiskenler icerisindeki blok aktif kaldigi surece var olurlar.
 *  3- Automatic Variables : Icerisinde bulundaklari blokta olusurlar ve blok bitince yok olurlar.
 *
 *
 *
 * Degiskenin Tipi ve Rolu   !!! Onemli !!!!
 *
 * Yerel ya da uye degisken olmak degiskenin tipinden bagimsiz, degiskenin rolunu belirleyen bir durumdur.
 *
 * Ilkel bir degisken rol olarak uye bir degisken ise , icinde oldugu nesnenin yaratildigi heapteki adres
 * alaninda bulunurken , bir metotta olusan bir referans bellekte stackte bulunacaktir.
 *
 * Ama stackteki bu referansin  gosterdigi nesne her halukarda heapte olacaktir.
 *
 * Ister referans olsun ister primitive olsun onemsizdir burada onemli olan degiskenin roludur.
 * Ilkel bir degisken rol olarak uye bir degisken olabilir , mesela Insan classi icinde tanimlnan age degiskeni aslinda bakildiginda
 * primitive evet ama sonucta Object Variable oldugundan Insan i betimliyordur.

 */
