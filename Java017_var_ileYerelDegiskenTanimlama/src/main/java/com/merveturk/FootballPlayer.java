package com.merveturk;

public class FootballPlayer extends Car{
    int no; // numarasi
    String name; // adi
    Boolean inPlay ; //oyunda mi degil mi
    int minutes ; // kac dk dir oyunda
    int numberOfGoals; // kac gol atti

    void play( int minutesToPlay){
        minutes+=minutesToPlay;
        System.out.println("Minutes to Play :" + minutes);
    }
    void score (){

        numberOfGoals++;
        System.out.println("Number of Goals : " + numberOfGoals);
    }

}
