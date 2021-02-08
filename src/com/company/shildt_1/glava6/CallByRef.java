package com.company.glava6;

class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }
    void Change (Test1 ob) {
        ob.a = ob.a + ob.b;
        ob.b = - ob.b;
    }
}

public class CallByRef {
    public static void main(String[] args) {
        Test1 ob = new Test1(15, 20);

        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);

        ob.Change(ob);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}