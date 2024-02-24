package com.merveturk;

import java.util.Scanner;

public class String_Ornek {
    public static void main(String[] args) {


        /*
        * m
        * me
        * mer
        * merv
        * merve
        * merv
        * mer
        * me
        * m
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı Giriniz:");
        String ad = sc.nextLine();

        String ifade="mahmut";
        for (int i = 0 ; i<=ifade.length();i++)
        {
            System.out.println(ifade.substring(0,i));

        }
        for (int k=ifade.length()-1 ; k>=0 ; k--)
        {
            System.out.println(ifade.substring(0,k));

        }
        // time complexity : O(2n)
        System.out.println("---------------------------------------");

        for (int i=0; i<= ad .length() ; i++)
        {
            System.out.println(ad.substring(0,i));
            if(i==ad.length()){
                for(i=ad.length()-1; i>= 0 ; i--)
                {
                    System.out.println(ad.substring(0,i));
                }
                break;
            }
        }
        // time complexity : O(2n)


    }
}
