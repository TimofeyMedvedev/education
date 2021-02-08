package com.company.glava5;

public class Zadanie5glava1 {
    public static void main(String[] args) {
        String msg = "This is a test";
        String emsg = "";
        String demsg = "";
        String key = "aJFnriDk";
        int j;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        j = 0;
        for(int i = 0; i < msg.length(); i++) {
            emsg = emsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(emsg);

        j = 0;
        for(int i = 0; i < msg.length(); i++) {
            demsg = demsg + (char) (emsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(demsg);
    }
}
