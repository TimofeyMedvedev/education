package com.company.glava14;

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int num = 10; // локальная переменная, которая м/б захвачена
        MyFunc myLam = (n) -> {
            int v = num + n; // такое использование переменной num корректно,
                             // потому что ее значение не изменяется
            // num++; Недопустимо, поскольку значение переменной num изменяется
            return v;
        };
        System.out.println(myLam.func(8));
        // num = 9; Вызовет ошибку, т.к. переменная num лишается статуса финальной переменной
    }
}
