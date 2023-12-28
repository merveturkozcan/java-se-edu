package com.merveturk;

public class Main {
    public static void main(String[] args) {

        Musteri musteri= new Musteri(); // boş parametreli.
        Musteri musteri1 = new Musteri("merve","türk",12345L,1234.0);

        System.out.println(musteri);
        System.out.println(musteri1.getAdi());





    }
}