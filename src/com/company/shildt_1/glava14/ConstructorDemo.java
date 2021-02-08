package com.company.glava14;

interface MyFun {
    MyClass func(String s);
}

class MyClass {
    private String str;

    MyClass(String s) {
        str = s;
    }
    MyClass() {
        str = "";
    }
    String getStr() {
        return str;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        MyFun mf = MyClass::new;
        MyClass mc = mf.func("Тестирование");

        System.out.println("Строка str в mc: " + mc.getStr());
    }
}
