package com.company.glava13.Stack;

public class StackDem<T> implements IGenS<T> {
    private T q[];
    private int t;

    StackDem(T[] aRef) {
        q = aRef;
        t = 0;
    }

    StackDem(T[] aRef, StackDem<T> ob) {
        t = ob.t;
        q = aRef;

        try {
            if (q.length < ob.q.length)
                throw new StackFullException(q.length);
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        for (int i = 0; i < t; i++)
            q[i] = ob.q[i];
    }

    StackDem(T[] aRef, T[] a) {
        q = aRef;
        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    public void push(T ch) throws StackFullException {
        if (t == q.length) {
            throw new StackFullException(q.length);
        }
        q[t] = ch;
        t++;
    }

    public T pop() throws StackEmptyException {
        if (t == 0) {
            throw new StackEmptyException();
        }
        t--;
        return q[t];
    }
}
