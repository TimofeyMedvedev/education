package com.company.javarush.uroven14.farm;

public class BelarusianHen extends Hen implements Country {
    final private static int countOfEggs = 42;


    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + countOfEggs + " яиц в месяц.";
    }
}
