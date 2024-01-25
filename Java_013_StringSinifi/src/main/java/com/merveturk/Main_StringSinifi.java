package com.merveturk;

import java.util.Scanner;

public class Main_StringSinifi {
    public static void main(String[] args) {

        String ifade = "  Bugün hava bok gibi yağmurlu ve fırtınalı    deli gibi esiyor .";
        System.out.println("İfadenin Uzunluğu :"  + ifade.length());
        System.out.println("charAt : " + ifade.charAt(10));
        System.out.println("---------------------------------------");

        String ad="Merve";
        System.out.println(ad.length());
        System.out.println("---------------------------------------");
        // adınızı bir değişkene atayarak alt alta yazdırınız.
        for (int i=0 ; i<ad.length() ; i++)
        {
            System.out.println(ad.charAt(i));
        }
        System.out.println("-----adınızı tersten yazdıran kodu yazınız. yontem 1 ---");
        // adınızı tersten yazdıran kodu yazınız.

        for (int i=0 ; i<ad.length() ; i++)
        {
            System.out.println(ad.charAt(ad.length()-1-i));
        }
        System.out.println("-----adınızı tersten yazdıran kodu yazınız. yontem  2---");
        for (int i=ad.length()-1 ; i>=0 ; i--)
        {
            System.out.println(ad.charAt(i));
        }
        System.out.println("İfade içerisinde ilk A harfi kaçıncı indiste kullanılmış ?  :  " + ifade.indexOf('a'));
        System.out.println("İfade içerisinde gizlenmiş metin var mı 'ağ'  :" + ifade.indexOf("ağ"));



        ifade = "yeni bir yazı";
        System.out.println("ifade substring ->[5,---  : " + ifade.substring(5));
        System.out.println("ifade substring ->[5 , 10) : " + ifade.substring(5,10));


        System.out.println("---------------------------------------");

        /*  Uygulama içerisine insanlar video foto vb tiplerinde belgeler yüklüyor ve burada bizden
        istenen dosyaların uzantılarına erişerek onları istifliyor olmamız. */

        String dosya1= "düğün resmi  - ev.jpeg";
        String dosya2= "tatil dönüşü.mp4 ";
        String dosya3= "iş notlarım.docx";

        System.out.println("Sırası ile dosya uzantıları bulma:");
        System.out.println(dosya1.substring(dosya1.indexOf(".")));
        System.out.println(dosya2.substring(dosya2.indexOf(".")));
        System.out.println(dosya3.substring(dosya3.indexOf(".")));

        System.out.println("---------------------------------------");


     /*   Kullanıcıların uygulama içerisine giriş yaptıklarını simüle eden bir kod yazacağız
        username : admin
        password : 12345
        Kullanıcıdan kadı ve şifre isteyecegiz elimizdeki veriler ile eşitse giriş yaptın değilse yanlıs diyecegiz.*/

        String ka="admin";
        String ps="12345";

        if(ka=="admin" && ps=="12345")
        {
            System.out.println("Giriş yaptınız ");
        }else {
            System.out.println("Yanlış şifre veya kullanıcı adı tekrar deneyin.");
        }


        System.out.println("---------------------------------------");
       /* Her olasılığa karşın kadı ve pas alınırken boşluk olursa diye bunları yok ederek kontrol etmemiz gerekli.
        bunun için .trim(); Başta ve Sonda olan boşlukları siler.*/

        ifade = "     trim deneme    ortadaki boşluk     ";
        System.out.println("Trim fonk deneme: "+ifade.trim());

        System.out.println("---------------------------------------");

        //Login page :
        Scanner sc = new Scanner(System.in);
        String email= "merve";
        String pass="123!";
        System.out.println("-----------Müşteri Otomasyonu Login Ekranı----------------------------");
        System.out.println("Kullanıcı Adı : ");
        String usr = sc.nextLine();
        System.out.println("Şifre giriniz:");
        String pwd= sc.nextLine();

        if(usr == email && pass == pwd )
           // if(usr.equals(email) && pass.equals(pwd) )
        {
            System.out.println("Login başarılı");

        }else {
            System.out.println("Deneme başarısız");
        }

        /*herşeyi doğru girmeme rağmen neden başarısız olurum ? Çünkü String ifadelerde bellek adresleri farklı oldugundan == kullanmak yanlıştır. eguals kullanmak gereklidir.
          equals : bellekteki değere bakar ve bu degerler eşit mi diye kontrol eder. Burada doğru olan kod if(usr.equals(email) && pass.equals(pwd) ) olmalıdır.
        */
        System.out.println("---------------------------------------");
        if(usr.equals(email) && pass.equals(pwd) )
        {
            System.out.println("Login başarılı");

        }else {
            System.out.println("Deneme başarısız");
        }




















    }
}
