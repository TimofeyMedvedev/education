package com.company.glava6;

class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Внутри статического блока");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

public class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Внутри конструктора");

        System.out.println("Корень квадратный из 2 равен: " + StaticBlock.rootOf2);
        System.out.println("Корень квадратный из 3 равен: " + StaticBlock.rootOf3);
    }
}
