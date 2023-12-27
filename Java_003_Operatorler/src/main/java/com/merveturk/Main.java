package com.merveturk;

public class Main {
    public static void main(String[] args) {


        //  + - * /
        int a = 25;
        int b = 10;
        int c = a + b;
        System.out.println("Toplama:" + c );



        float sonuc = a / b;  // 2 tam sayı arasında çalışıyorsan bölme işlemine dikkat edeceksin.
        float sonuc2 = (float)a / b;
        float sonuc3 = a / (float)b;
        float sonuc4 = (float)(a / b);
        System.out.println("Bölme:" + sonuc );
        System.out.println("Bölme:" + sonuc2 );
        System.out.println("Bölme:" + sonuc3 );
        System.out.println("Bölme:" + sonuc4 );

        System.out.println("Mod Alma :" + (a % b) );

        // Ternary operator (üçlü operatör)
        System.out.println((a>b) ? "Evet" : "Hayır" );

        int i=0;
        System.out.println( i+1 );  // i değeri 1 kez artar ancak atama yapmadık o nedenle alt satırdaki kodda sonuc 0 olur.
        System.out.println( i+1 );

        i= i + 4;
        System.out.println(i);

        System.out.println(--i);
        System.out.println(++i);

















    }
}