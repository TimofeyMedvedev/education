package com.company.javarush.uroven15.template;

public class Solution {
    public static void main(String[] args) {
        DrinkMaker dm = new TeaMaker();
        dm.makeDrink();
        dm = new LatteMaker();
        dm.makeDrink();
    }
}
