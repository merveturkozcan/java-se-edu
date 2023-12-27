package com.merveturk;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class For {
    public static void main(String[] args) {

        int i=0;
        ++i;  // i=i+1; demektir
        System.out.println(i);

        i=i+1;
        System.out.println(i);
        System.out.println("---------------------");


        // for ( ; ; ) {} sonsuz döngü

        for (byte k=0 ; k<20 ; k++)
            System.out.println(k);

        for (byte j=0 ; j<20 ; j++){

            System.out.print (j + " ");
            System.out.println(j*2);
        }

        System.out.println("---------------------");
        for (int m=0 ;  m<10 ; m++)
        {
            System.out.println ("M: " + m );

            for (int j=0 ;  j<32 ; j=j+5)
            {
                System.out.println ("\t J: " + j );

            }
        }

        System.out.println("---------------------");

    }
}