package com.company.javarush.uroven14;
import java.util.ArrayList;
import java.util.List;

/*
Клининговый центр
*/

public class Solution6 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        apartments.add(new OneRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for(Apartment i : apartments)
            if(i instanceof OneRoomApt)
                ((OneRoomApt) i).clean1Room();
            else if(i instanceof TwoRoomApt)
                ((TwoRoomApt) i).clean2Rooms();
            else if(i instanceof ThreeRoomApt)
                ((ThreeRoomApt) i).clean3Rooms();
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}