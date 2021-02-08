package com.company.glava6;

class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    boolean sameBlock (Block ob) {
        if((a == ob.a) & (b == ob.b) & (c == ob.c)) return true;
        else return false;
    }
    boolean sameVolume (Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2 ,5);
        Block ob2 = new Block(10, 2 ,5);
        Block ob3 = new Block(4, 5 ,5);

        System.out.println("ob1 имеет те же размеры, что и ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 имеет те же размеры, что и ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 имеет тот же объём, что и ob3: " + ob1.sameVolume(ob3));
    }
}
