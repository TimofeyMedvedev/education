package com.company.javarush.uroven14.farm;

public class MoldovanHen extends Hen implements Country {
    final private int countOfEggs = 25;


    public int getCountOfEggsPerMonth() {
        return countOfEggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + countOfEggs + " яиц в месяц.";
    }
}
