package com.company.glava14;

interface MyPValue {
    double getValue(double v);
}

public class Lambda {
    public static void main(String[] args) {
        MyPValue myPval = (n) -> 1.0 / n;

        System.out.println("Значение, обратное значению 4.0, равно " + myPval.getValue(4.0));

        myPval = n -> Math.random() / n;
        System.out.println(myPval.getValue(2.0));
    }
}
