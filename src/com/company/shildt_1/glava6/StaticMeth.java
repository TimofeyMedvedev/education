package com.company.glava6;

class StaticDemoS {
    static int val = 1024;

    static int valD() {
        return val / 2;
    }
}

class StaticMeth {
    public static void main(String[] args) {

        System.out.println("Значение val: " + StaticDemoS.val);
        System.out.println("StaticDemoS.valD(): " + StaticDemoS.valD());

        StaticDemoS.val = 4;
        System.out.println("Значение val: " + StaticDemoS.val);
        System.out.println("StaticDemoS.valD(): " + StaticDemoS.valD());
    }
}
