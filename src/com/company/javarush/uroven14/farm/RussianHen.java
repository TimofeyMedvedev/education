package com.company.javarush.uroven14.farm;

public class RussianHen extends Hen implements Country {
    final private static int countOfEggs = 33;


    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + countOfEggs + " яиц в месяц.";
    }
}
