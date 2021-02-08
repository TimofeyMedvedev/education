package com.company.shildt_1.glava5;

class ShowBits1 {
    int numbits;

    ShowBits1 (int n) {
        numbits = n;
    }
    void show(long val) {
        long mask = 1;

        mask <<= numbits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits1 b = new ShowBits1(8);
        ShowBits1 i = new ShowBits1(32);
        ShowBits1 li = new ShowBits1(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);

        System.out.println("\nМладшие 8 битов числа 87987" +
                " в двоичном представлении: ");
        b.show(87987);
    }
}
