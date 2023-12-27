package com.merveturk;

public class ForEach {

    public static void main(String[] args) {

        String ogrenci1 = "Mert";
        String ogrenci2 = "Merve";
        String ogrenci3 = "Melisa";
        String ogrenci4 = "Murat";

        String [] ogrenciler = {"Merve" , "Melisa" , "Murat" , "Mert"};
        for ( String item : ogrenciler) {
            System.out.println(item);
        }

        System.out.println("----------------------------");

        int [] numbers = {2,3,6,70,90,0,-12,-49};
        for ( int number : numbers) {
            System.out.println(number);
            System.out.println( number + (number*0.25) );  // % 25 artış ver
            System.out.println("*****");
        }
        

    }


}
