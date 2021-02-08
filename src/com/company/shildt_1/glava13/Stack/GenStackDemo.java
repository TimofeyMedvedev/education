package com.company.glava13.Stack;

public class GenStackDemo {
    public static void main(String[] args) {
        Integer iOb[] = new Integer[10];
        StackDem<Integer> stc = new StackDem<>(iOb);

        String name[] = {"One", "Two", "Three"};
        String sOb[] = new String[3];
        StackDem<String> stc2 = new StackDem<>(sOb, name);

        String str;
        int n;

        try {
            for (int i = 0; i < 10; i++)
                stc.push(i);
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        String sOb2[] = new String[3];
        StackDem<String> stc3 = new StackDem<>(sOb2, stc2);

        try {
            System.out.print("Содержимое stc: ");
            for(int i = 0; i < 10; i++) {
                n = stc.pop();
                System.out.print(n + " ");
            }

            System.out.println("\n");

            System.out.print("Содержимое stc2: ");
            for(int i = 0; i < 3; i++) {
                str = stc2.pop();
                System.out.print(str + " ");
            }

            System.out.println("\n");

            System.out.print("Содержимое stc3: ");
            for(int i = 0; i < 3; i++) {
                str = stc3.pop();
                System.out.print(str + " ");
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();
    }
}
