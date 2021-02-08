package com.company.glava6;

class Test {
    void NoChange (int i, int j) {
        i = i + j;
        j = - j;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a и b перед вызовом: " + a + " " + b);

        ob.NoChange(a, b);

        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
