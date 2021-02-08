package com.company.glava6;

class Quene {
    private char q[];
    private  int putloc, getloc;

    Quene (int size) {
        q = new char[size +1];
        putloc = getloc = 0;
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
public class QDemo2 {
    public static void main(String[] args) {
        Quene bigQ = new Quene(100);
        Quene smallQ = new Quene(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для" +
                " сохранения алфавита");
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ" +
                " для генерации ошибок");
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        System.out.print("Содержимое smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
