package com.company.glava14;

interface IntPredicat {
    boolean test(int n);
}

class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    boolean hasCommonFactor(int n) {
        for(int i = 2; i <= v / i; i++)
            if ((v % i) == 0 && (n % i) == 0)
                return true;
        return false;
    }
}

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum1 = new MyIntNum(11);
        MyIntNum myNum2 = new MyIntNum(6);

        IntPredicat ip = myNum1::isFactor;

        result = ip.test(3);
        if(result) System.out.println("3 является делителем " + myNum1.getNum());

        ip = myNum1::hasCommonFactor;
        result = ip.test(11);
        if(!result) System.out.println("11 не имеет общих делителей с " + myNum1.getNum());

        ip = myNum2::hasCommonFactor;
        result = ip.test(18);
        if(result) System.out.println("18 имеет общие делители с " + myNum2.getNum());

        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 не является делителем " + myNum2.getNum());
    }
}
