package com.company.javarush.uroven21;

import java.util.Date;

/*
Ошибка в equals/hashCode
*/
public class Solution5 {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private Solution5 solution;

    public Solution5 (int anInt, String string, double aDouble, Date date, Solution5 solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution5)) return false;

        Solution5 solution1 = (Solution5) o;

        if (Double.compare(solution1.aDouble, aDouble) != 0) return false;
        if (anInt != solution1.anInt) return false;
        if (date != null ? !date.equals(solution1.date) : solution1.date != null) return false;
        if (solution != null ? !solution.equals(solution1.solution) : solution1.solution != null) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = anInt;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {

    }
}
