package com.merveturk;

import java.util.Scanner;

public class String_Ornek2 {
    //Dışarıdan bir ifade girişi olsun , ve bu ifade içerisinde kaç tane a harfi var bulan kodu yazınız
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence :");
        String sentence = sc.nextLine();

        // dünya garip insanlar daha da garip.
        int counter=0;
        for (int i = 0 ; i<sentence.length() ; i++){
           if(sentence.charAt(i)==('A')  || sentence.charAt(i)==('a'))
               counter++;
        }
        System.out.println("Counter:" +counter);
    }


}
