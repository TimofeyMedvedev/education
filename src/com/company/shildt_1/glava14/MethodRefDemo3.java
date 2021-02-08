package com.company.glava14;

interface MyIntNumPredicate {
    boolean test(MyIntNum1 mv, int n);
}

class MyIntNum1 {
    private int v;

    MyIntNum1(int w) {
        v = w;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum1 myNum1 = new MyIntNum1(12);
        MyIntNum1 myNum2 = new MyIntNum1(16);

        MyIntNumPredicate inp = MyIntNum1::isFactor;

        result = inp.test(myNum1, 3);
        if(result) System.out.println("3 является делителем " + myNum1.getNum());

        result = inp.test(myNum2, 3);
        if(!result) System.out.println("3 не является делителем " + myNum2.getNum());
    }
}
