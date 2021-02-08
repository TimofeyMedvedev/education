package com.company.glava12;

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

public class ShowEnum {
    public static void main(String[] args) {
        for(Tools t : Tools.values())
            System.out.println(t + " имеет порядковый номер " +
                    t.ordinal());
    }
}
