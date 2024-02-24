package com.merveturk;

public class NullKavrami {
    // 

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("car1:" + car1.toString());
        System.out.println("car2:" + car2.toString());

        Car temp= car1;
        car1=car2;
        car2=temp;
        car2=null;

        System.out.println("car1:" + car1.toString());
        System.out.println("car2:" + car2.toString());


    }
}
