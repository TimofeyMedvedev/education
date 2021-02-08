package com.company.javarush.uroven21.hippodrome;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome (List<Horse> list) {
        horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void move() {
        for(Horse horse : horses)
            horse.move();
    }

    public void print() {
        for(Horse horse : horses)
            horse.print();
        for(int i = 0; i < 10; i++)
            System.out.println();
    }

    public void run() {
        for(int i = 1; i <= 100; i ++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException exc) {}
        }
    }

    public Horse getWinner() {
        double d = 0;
        for(Horse horse : horses)
            if(d < horse.getDistance())
                d = horse.getDistance();

        for(Horse horse : horses)
            if(d == horse.getDistance()) {
                return horse;
            }
        return null;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        Hippodrome.game = new Hippodrome(new ArrayList<>());

        Hippodrome.game.horses.add(new Horse("Vasya", 3, 0));
        Hippodrome.game.horses.add(new Horse("Petya", 3, 0));
        Hippodrome.game.horses.add(new Horse("Borya", 3, 0));

        Hippodrome.game.run();
        Hippodrome.game.printWinner();
    }
}