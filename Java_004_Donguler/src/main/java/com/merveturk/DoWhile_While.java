package com.merveturk;

public class DoWhile_While {

    public static void main(String[] args) {

        System.out.println("-------for---------");
        for (int i =0 ; i < 10 ; i++) {
            System.out.println(i);
        }

        System.out.println("-------while---------");

        int i=0;
        while (i<10){
            System.out.println("i değeri : " + i);
            i++;
        }

        // while(true) {}   :   sonsuz döngü

        System.out.println("-------do-while---------");
        // genelde login ekranlarında bu kullanılır .

        int k=0;
        do{
            System.out.println(" k degeri : " + k);
            k++;
        }
        while(k<3);



    }
}
