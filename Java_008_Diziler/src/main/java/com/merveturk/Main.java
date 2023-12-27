package com.merveturk;

public class Main {
    public static void main(String[] args) {


        // dizilerin boyutu çalışma esnasında değişir mi ? hayır.
        int [] sayilar = new int [5];
        sayilar [0]=10;
        sayilar [1]=20;
        sayilar [2]=30;
        sayilar [3]=40;
        sayilar [4]=50;

        //sayilar[126]= 23;
        //System.out.println(sayilar[126]);  // çalışır mı ?
        // Hayır index out of bounds hatası alırız. Dizinin Sınırı aşılır. Bu dizinin boyutu 5 tir.

        short [] myArray = new short[4];
        // myArray[0]= 22222222; // tipi short ancak atanan değer daha büyük boyutu aştığından hata alırız.


        short [] myArray2 = new short[4];
        myArray2[0]= 23;
        System.out.println(myArray2[0]);
        System.out.println(myArray2[1]);
        System.out.println(myArray2[2]);
        System.out.println(myArray2[3]);
        // çıktısı : 23 , 0 , 0, 0  olur. atanmayan değerleri 0 alır.
        // dizinin 1-2-3 indexine değer ataması yapmadık ancak java bunu default olrak 0 ataması yapar.

        System.out.println("-------------------------------------");

        byte [] myArrayByte = {12,15,14,23,11,13};
        System.out.println(myArrayByte[3]);

        System.out.println("-------------------------------------");


        for ( int i= 0 ; i < myArrayByte.length ; i++){
            System.out.println(myArrayByte[i]);

        }


        System.out.println("--------İki Boyutlu  Diziler---------");
        int [][] matrix = {{2,3,5},{1,0,9},{4,7,8},{2,6,3}};

        for (int i=0 ; i < matrix.length; i++)  // dizi boyutunun dinamik yazılması için
        {
            for (int j = 0 ; j < matrix[0].length ; j++)
            {
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println( " ");
        }




    }
}