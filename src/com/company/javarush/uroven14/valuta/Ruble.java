package com.company.javarush.uroven14.valuta;

public class Ruble extends Money {

    public Ruble(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "RUB";
    }
}
