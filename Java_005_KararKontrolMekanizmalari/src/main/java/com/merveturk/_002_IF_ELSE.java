package com.merveturk;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _002_IF_ELSE {
    public static void main(String[] args) {

        System.out.println("---------------Oy Kullanma-------------------");
        byte kural = 18;
        Scanner sc = new Scanner(System.in);
        System.out.print("Seçmen yaşını giriniz:  ");
        byte secmenYasi = sc.nextByte();

        if (secmenYasi < kural) {
            System.out.println("Oy kullanamaz yaşı küçük ");
        } else {
            System.out.println("Oy kullanabilir.");
        }


        System.out.println("--------------Ehliyet Kullanma---------------");

        boolean saglikDurumu = false;
        System.out.print("Aday yaşını giriniz:  ");
        byte adayYasi = sc.nextByte();

        if (saglikDurumu==true) {

            if (adayYasi == 16) {
                System.out.println("Aday stajer olabilir.");
            } else if (adayYasi > 17) {
                System.out.println("Reşit ehliyet Alabilir. ");
            } else {
                System.out.println("Ehliyet için uygun değilsiniz. ");

            }
        } else
            System.out.println("Ehliyet için saglık durumunuz yetersiz .");


        System.out.println("--------------For ile break/continue kullanımı ---------------");

        for (int k = 0 ; k < 100 ; k++)
        {
            if( k== 3 )
            {
                System.out.println( "K değeri bulundu " + k );
                break;  // continue deseydik devam ederdi. break dedıgımızde dongu kırılır.
            }else System.out.println(k);
        }





    }
}
