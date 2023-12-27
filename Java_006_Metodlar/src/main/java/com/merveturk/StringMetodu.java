package com.merveturk;

public class StringMetodu {

    public static void main(String[] args) {

        StringMetodu obj = new StringMetodu();

        obj.selamVer("Merve Türk");
        obj.selamVer("Hakan Özcan");
        selamVer("merve","hakan","melisa");

        String sonuc = getHesabiKapat( 7 , true);
        System.out.println(sonuc);

    }

    private static String getHesabiKapat(int uyeNo,boolean uyeDurumu) {
        if( uyeNo > 1 ){
            return "Hesap Kapandı";
        }
        return "Olmadı ";
     }

    private static void selamVer(String deger1, String deger2, String deger3) {
        System.out.println("Merhaba " + deger1 +" "+ deger2 +" " + deger3 );
    }

    private void selamVer(String deger) {
        System.out.println("Merhaba " + deger);
    }


}
