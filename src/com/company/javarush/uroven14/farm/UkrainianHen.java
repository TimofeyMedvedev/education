package com.company.javarush.uroven14.farm;

public class UkrainianHen extends Hen implements Country {
    final private static int countOfEggs = 39;


    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + countOfEggs + " яиц в месяц.";
    }
}
