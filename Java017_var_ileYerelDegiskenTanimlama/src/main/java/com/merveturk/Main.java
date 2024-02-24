package com.merveturk;

public class Main {

    //var m=5;  // hata cunku instance variable var olarak tanimlanamaz.

    public static void main(String[] args) {
        /* var ile degisken tanimlamak icin
           ilk deger atamasi yapilmasi sarttir.
           Aksi durumda java var ile tanimlanan
           degiskenin tipini belirleyemez. */

        /* Ozellikle collection yapilarinda
        tek satirda yazilan kodlarda
        donus tipi ne oldugunu bilmedigin zamanlarda
        kulanilmasi avantaj saglar. */

        /* Instance(field) veri tiplerini var olarak tanimlayamazsin */

        var i=5;

        // int i=5;//yukaridaki satir ile ayni
        // var i ; // hatali tip bilgisi cikarilamaz .

        var car1= new Car();
       //Car car1= new Car(); // yukaridaki satir ile ayni.

        var jj = 1.0f/2;
        System.out.println("jj :" + jj );

        byte b = 8 ;
        var jjj=b/4.0;   // sonuc ne gelirse o tipte
        System.out.println("jjj :" + jjj );

        int myArray[]= new int[3];
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;

        System.out.print("Array :");
        for (var t : myArray)  // array tipinde yani int
            System.out.print( t + " ");

        var a = " ".isBlank();  // booelan
        var aa = " ".isEmpty();
        System.out.println(a + " " + aa + " ");



    }
}