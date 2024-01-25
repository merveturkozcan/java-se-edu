package com.merveturk;

import java.util.Locale;
import java.util.Scanner;

public class StringIfadeler_Upper_Lower {
    public static void main(String[] args) {
        // .toUpperCase();   büyük harfe çevirir.
        // .toLowerCase();   küçük harfe çevirir.
        // Bilgisayarın dil ayrımını dikkate alırsak yanlış sonuç almamak için locale.english gibi değerler vermemiz gereklidir.
        // Nerelerde kullanılır ? login ekranlarında username alıp doğrulama yaparken kolaylık sağlar.
        String deger= "Merhaba java nasılsın?";
        System.out.println(deger.toUpperCase());
        System.out.println(deger.toLowerCase());
        deger= "iüş";
        System.out.println(deger.toUpperCase(Locale.ENGLISH)); // burada dönüşüm yapar ş harfi yoksa ş olarak basar , ancak büyük İ yerine I oldugundan değiştirir.
        System.out.println(deger.toLowerCase(Locale.ROOT)); // makinanın ana dilini kullanır .

        System.out.println("---------upper lower ile büyük küçük kontrolü yapan kod ------------------------------");

        // her zaman alınan değerler uppercase, lowercase kullanılarak kontrol edilmelidir. aksi takdirde bir harf bile bğyğk küük oldugunda hata verecktir.

        String username="mtturk";
        String password="123";

        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adını girin : ");
        String usr=sc.nextLine();
        System.out.print("Şifre girin : ");
        String pass=sc.nextLine();

        if(( usr.toUpperCase(Locale.ENGLISH).equals(username.toUpperCase(Locale.ENGLISH)) )  && (password.toUpperCase(Locale.ENGLISH).equals(pass.toUpperCase(Locale.ENGLISH))))
        {
            System.out.println("Doğru giriş ");

        }else {
            System.out.println("Yanlış giriş");
        }

        System.out.println("---------Upper Lower yapmadan (equalsIgnoreCase ile ) büyük küçük kontrolü yapan kod ----------------");


        System.out.print("Kullanıcı adını girin : ");
        usr=sc.nextLine();
        System.out.print("Şifre girin : ");
        pass=sc.nextLine();
        if(( username.equalsIgnoreCase(usr))  && (password.equalsIgnoreCase(pass)))
        {
            System.out.println("Doğru giriş ");

        }else {
            System.out.println("Yanlış giriş");
        }
    }
}
