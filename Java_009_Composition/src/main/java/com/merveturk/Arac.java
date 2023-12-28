package com.merveturk;

public class Arac {

    public Arac() {
        System.out.println("arac");
    }

    private Yakit yakit = new Yakit();
    private Koltuk koltuk = new Koltuk();
    private Depo depo = new Depo();


    void hareketEt() {
        if (yakit.yakitDurumu()==true)
            System.out.println("Harekete geçildi");
        else
            System.out.println("Yakıt yetersiz");
    }


}
