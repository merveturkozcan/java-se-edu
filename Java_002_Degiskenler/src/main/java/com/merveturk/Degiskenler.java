package com.merveturk;

public class Degiskenler {
    /*
         Javada değişkenler 2 türde incelenir.
         İlkel tipler ve Sınıf tipleri olarak. İlkel tipler olduğu için %100 nesne yönelimli bir dil değildir.

         Neye göre kullanımı değişir? İlkel tipler masrafsız tiplerdir , örneğin hiç değişmeyen bir sabit tip vardır o zaman ilkel tip kullanırım .
         ancak tiplerle işlem yapacaksam gibi o zaman Sınıf tipleri kullanılır.

     ------ data types memory size --------
     byte : -128 +127  (1 byte )
     short : 2 byte
     int : 4 byte
     long: 8 byte
     float: 4 byte
     double : 8 byte
     char: 2 bytes : 0 to 65535
     boolean: 1 bit

      */


    public static void main(String[] args) {

        String firstName = null;  // yokluk hiçlik
        String lastName = "";  // var ama boş demektir.


        int myInt = 20;
        byte myByte = 127;
        short myShort = 20;
        long myLong = 20;
        char myChar = 'M';
        double myDouble = 1.123456788902345678900000;  // hassasiyeti 16 karakterdir ve float a göre daha çok yer kaplar.
        float myFloat = 2.01234567890123456789f;
        boolean myBoolean= true;

        System.out.println("My int :" + myInt);
        System.out.println("My byte :" + myInt);
        System.out.println("My Short :" + myShort);
        System.out.println("My Long :" + myLong);
        System.out.println("-------------------------");

        Integer myInt2 = 20;
        Byte myByte2 = 127;
        Short myShort2 = 20;
        Long myLong2 = 20L;
        Character myChar2 = 'M';
        Double myDouble2 = 1.123456788902345678900000;  // hassasiyeti 16 karakterdir ve float a göre daha çok yer kaplar.
        Float myFloat2 = 2.01234567890123456789f;
        Boolean myBoolean2 = true;

        System.out.println("My int2 :" + myInt2);
        System.out.println("My byte2 :" + myInt2);
        System.out.println("My Short2 :" + myShort2);
        System.out.println("My Long2 :" + myLong);
        System.out.println("-------------------------");







    }
}
