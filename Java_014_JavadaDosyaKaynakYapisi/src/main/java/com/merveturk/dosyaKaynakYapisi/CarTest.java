package com.merveturk.dosyaKaynakYapisi;

 public class CarTest {

    public static void main(String[] args) {

        Car referanceCar1 = new Car();
        referanceCar1.make="Mercedes";
        referanceCar1.model="c200";
        referanceCar1.year="2019";
        referanceCar1.speed=0;
        referanceCar1.distance=0;
        String info = referanceCar1.getInfo();
        System.out.println(info);

        System.out.println("When the car moves.");
        referanceCar1.accelerate(125);
        referanceCar1.go(100);
        referanceCar1.go(50);
        System.out.println(referanceCar1.getInfo());
        referanceCar1.stop();
        System.out.println(referanceCar1.getInfo());

        Car referanceCar2 = new Car();
        referanceCar2.make="BMW";
        referanceCar2.model="i8";
        referanceCar2.year="2017";
        referanceCar2.speed=160;
        referanceCar2.distance=10000;
        System.out.println(referanceCar2.getInfo());

        referanceCar2.accelerate(220);
        double timetoGo=referanceCar2.go(190);
        System.out.println("Time to go 1000 km " + timetoGo + " hour ");
        System.out.println(referanceCar2.getInfo());


    }

}
