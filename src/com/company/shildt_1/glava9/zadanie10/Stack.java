package com.company.glava9.zadanie10;

public class Stack {
    private char q[];
    private int t;

    Stack(int size) {
        q = new char[size];
        t = 0;
    }

    Stack(Stack ob) {
        t = ob.t;
        q = new char[ob.q.length];
        for (int i = 0; i < t; i++)
            q[i] = ob.q[i];
    }

    Stack(char a[]) {
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (QueueFullException1 exc) {
                System.out.println(exc);
            }
        }
    }

    void push(char ch) throws QueueFullException1 {
        if (t == q.length) {
            throw new QueueFullException1(q.length);
        }
        q[t] = ch;
        t++;
    }

    char pop() throws QueueEmptyException1 {
        if (t == 0) {
            throw new QueueEmptyException1();
        }
        t--;
        return q[t];
    }
}
