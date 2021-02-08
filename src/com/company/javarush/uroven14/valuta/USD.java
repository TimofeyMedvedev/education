package com.company.javarush.uroven14.valuta;

public class USD extends Money {

    public USD(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "USD";
    }
}
