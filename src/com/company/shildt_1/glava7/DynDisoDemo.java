package com.company.glava7;

class Sup {
    void who() {
        System.out.println("who() в Sup");
    }
}
class Sub1 extends Sup {
    void who() {
        System.out.println("who() в Sub1");
    }
}
class Sub2 extends Sup {
    void who() {
        System.out.println("who() в Sub2");
    }
}

public class DynDisoDemo {
    public static void main(String[] args) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();
        supRef = subOb1;
        supRef.who();
        supRef = subOb2;
        supRef.who();
    }
}

