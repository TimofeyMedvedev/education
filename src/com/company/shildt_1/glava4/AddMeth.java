package com.company.glava4;

class Vehicle1 {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
    System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }
}

public class AddMeth {
    public static void main(String[] args) {
        Vehicle1 minivan = new Vehicle1();
        Vehicle1 sportscar = new Vehicle1();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров.");
        minivan.range();

        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров.");
        sportscar.range();
    }
}
