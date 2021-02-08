package com.company.glava6;

class Queue {
    private char q[];
    private  int putloc, getloc;

    Queue (int size) {
        q = new char[size +1];
        putloc = getloc = 0;
    }

    Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        for(int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Queue(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for(int i = 0; i < a.length; i++) put(a[i]);
    }

    void put(char ch) {
        if(putloc == q.length - 1) {
            System.out.println(" - Оцередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println(" - Оцередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

public class QDemo3 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);
        char ch;
        int i;

        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        Queue q3 = new Queue(q1);

        System.out.print("Содержимое очереди q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
