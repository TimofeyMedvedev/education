package com.company.javarush.uroven15.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution implements Planet {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            if(str.equals(SUN))
                thePlanet = Sun.getInstance();
            else if(str.equals(MOON))
                thePlanet = Moon.getInstance();
            else if(str.equals(EARTH))
                thePlanet = Earth.getInstance();
            else thePlanet = null;
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
