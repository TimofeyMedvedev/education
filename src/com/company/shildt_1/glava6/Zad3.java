package com.company.glava6;

public class Zad3 {
    private char q[];
    private int t;

    Zad3(int size) {
        q = new char[size];
        t = 0;
    }

    Zad3(Zad3 ob) {
        t = ob.t;
        q = new char[ob.q.length];
        for (int i = 0; i < t; i++)
            q[i] = ob.q[i];
    }

    Zad3(char a[]) {
        q = new char[a.length];
        for (int i = 0; i < a.length; i++)
            push(a[i]);
    }

    void push(char ch) {
        if (t == q.length) {
            System.out.println(" -- Стек заполнен");
            return;
        }
        q[t] = ch;
        t++;
    }

    char pop() {
        if (t == 0) {
            System.out.println(" -- Стек пуст");
            return (char) 0;
        }
        t--;
        return q[t];
    }
}

class Zad33 {
    public static void main(String[] args) {
        Zad3 stk1 = new Zad3(10);
        char name[] = {'T', 'o', 'm'};
        Zad3 stk2 = new Zad3(name);
        char ch;
        int i;

        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        Zad3 stk3 = new Zad3(stk1);

        System.out.print("Содержимое стека stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}

