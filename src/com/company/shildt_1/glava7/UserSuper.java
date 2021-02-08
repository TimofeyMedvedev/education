package com.company.glava7;

class A {
    int i;
}
class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }
    void show() {
        System.out.println("i  в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}

public class UserSuper {
    public static void main(String[] args) {
        B sub = new B(1, 2);
        sub.show();
    }
}
