package com.company.javarush.uroven14.valuta;

public class Hrivna extends Money {

    public Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "UAH";
    }
}
