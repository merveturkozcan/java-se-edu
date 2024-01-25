package com.merveturk;

import java.util.Scanner;

public class Main_String_Pool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // == adreslere bakar. burada yukarıdaki iki ifade stringpool havuzunda aynı adrese atandıgından sonuc eşittir cıkacaktır.
        // equals diyerek string ifadelerin içerisindeki değerlere bakılır.



/*      String pool ile  javada aynı string ifadeler bir havuz içinde toplanarak gereksiz bellek harcamasının önüne geçilmiş olur.
        Burada tanımlanan ifadeler farklı değişkenler tarafından kullanılsa da bellek adresleri aynı olacaktır.
        Ancak özel methodlar uygulanan (.trim() .substring()) gibi ifadelerin oluşturduğu değerler String havuzunda bulunup yeniden adreslendikleri için
        diğer string ifadeleri ile eşitlik sağlamazlar.
        Bu nedenle String ifadelerini kontrol etmek, karşılaştırmak istiyorsanız
        .equals methodunu kulllanmamız doğru sonuclar verecektir. */

        String ifade1="ahmet";
        String ifade2="ahmet";

        if(ifade1==ifade2)
        {
            System.out.println("eşittir");
        }
        else
        {
            System.out.println("eşit değildir.");
        }

        System.out.println("---------------------------------------");

        ifade1="ahmet";
        ifade2="ahmet";
        if(ifade1.trim()==ifade2.trim())
        {
            System.out.println(" eşittir");
        }
        else
        {
            System.out.println(" eşit değildir.");
        }
        System.out.println("---------------------------------------");

        ifade1="ahmet";
        ifade2="   ahmet";
        if(ifade1.trim()==ifade2.trim())
        {
            System.out.println(" eşittir");
        }
        else
        {
            System.out.println(" eşit değildir.");  // heap degerleri eşit olmadıgından eşitlik olmayacktır.
        }

        System.out.println("---------------------------------------");
        System.out.println("deger ifadesinin degerini giriniz : ");
        String deger = sc.nextLine();
        String deger2="merve";
        if(ifade1==ifade2)
        {
            System.out.println("eşittir");
        }
        else
        {
            System.out.println("eşit değildir.");
        }
        System.out.println("---------------------------------------");

        System.out.println("deger3 ifadesinin degerini giriniz : ");
        String deger3 = sc.nextLine();
        System.out.println("deger4 ifadesinin degerini giriniz : ");
        String deger4= sc.nextLine();
        if(deger3==deger4)
        {
            System.out.println("eşittir");
        }
        else
        {
            System.out.println("eşit değildir.");
        }

        System.out.println("---------------------------------------");











    }
}
