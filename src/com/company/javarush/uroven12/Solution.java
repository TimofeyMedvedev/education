package com.company.javarush.uroven12;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
//        if(o.toString().length() < 5) //с переопределением метода toString
//            return o.toString();
        if(o instanceof Cat)
            return "Кот";
        else if(o instanceof Tiger)
            return "Тигр";
        else if(o instanceof Lion)
            return "Лев";
        else if(o instanceof Bull)
            return "Бык";

        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
