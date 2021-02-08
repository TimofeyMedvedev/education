package com.company.glava4;

public class VehicleK {
        int passengers;
        int fuelcap;
        int mpg;

        VehicleK(int p, int f, int m) {
            passengers = p;
            fuelcap = f;
            mpg = m;
        }

        int range() {
            return mpg * fuelcap;
        }

        double fuelneeded (int miles) {
            return (double) miles / mpg;
        }
}
