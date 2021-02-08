package com.company.glava7;

import com.company.glava7.interfeis.Series;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for(int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Следующее значение ByTwos: " + ob.getNext());
            ob = threeOb;
            System.out.println("Следующее значение ByThrees: " + ob.getNext());
        }
    }
}
