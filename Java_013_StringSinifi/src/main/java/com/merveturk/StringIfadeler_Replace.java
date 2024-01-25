package com.merveturk;

public class StringIfadeler_Replace {
    public static void main(String[] args) {

        /*
        * "2022 yılı en yüksek değere sahip uygulamalrı.xlsx" ifadesinde bulunan
        * boşluklar yerine -
        * türkçe karakterler ingilizce karakter değiştir.
        *
        * bu kurallara göre çıktı veren kodu yazınız.
        * */

        String deger="2022 yılı en yüksek değere sahip uygulamalrı.xlsx";
        deger = deger.replace(" ", "-");

        String []  turkceKarakter   = {"ı","ü","ç","ş","ğ","ö"} ;
        String []  engKarakter      = {"i","u","c","s","g","o"} ;


        for(int k=0;k<turkceKarakter.length;k++)
        {
            deger = deger.replace(turkceKarakter[k], engKarakter[k]);
        }
        System.out.println(deger);



    }
}
