package com.merveturk;

import java.util.Scanner;

public class _003_SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir harf seçiniz: ");
        Character secim = sc.next().charAt(0);

        switch (secim)
        {

            // case sensitive bakıyor !
            case 'a':
                System.out.println("Seçimin" + secim);
                break;

            case 'B':
                System.out.println("Seçimin" + secim );
                break;

            case 'c':
                System.out.println("Seçimin " + secim );
                break;

            default:
                System.out.println("Doğru Seçemedin");
                break;

        }

    }
}
