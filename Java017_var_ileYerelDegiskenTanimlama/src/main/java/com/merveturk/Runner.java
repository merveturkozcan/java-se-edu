package com.merveturk;

public class Runner {
    public static void main(String[] args) {

            FootballPlayer alex = new FootballPlayer();
            alex.name="Alex de Souza";
            alex.no=10;
            alex.minutes=0;
            alex.numberOfGoals=0;
            alex.inPlay=true;

        alex.play(90);
        alex.score();
        alex.score();

        System.out.println(alex.numberOfGoals);
        System.out.println("Alex play tottally :" + alex.minutes);




        }

    }
