package com.merveturk;

import java.util.Scanner;

public class StringIfadeler_Ornek2 {

    /*
    * Dışarıdan bir ifade girişi olsun , ve bu ifade içerisinde kaç tane a harfi var bulan kodu yazınız.
    *
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("bir ifade Giriniz:");
        String ad = sc.nextLine();

        for (int i = 0 ; i< ad.length() ; i++)
        {
            //merve turk selam
            Character temp= ad.charAt(i);

        }



    }



}
