package com.company.glava4;

public class VehConsDemo {
    public static void main(String[] args) {
        VehicleK minivan = new VehicleK(7, 16, 21);
        VehicleK sportscar = new VehicleK(2, 14, 12);
        int dist = 252;
        double gallons;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");

    }
}
