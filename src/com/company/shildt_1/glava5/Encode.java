package com.company.glava5;

public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String emsg = "";
        String demsg = "";
        int key = 4567;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        for(int i = 0; i < msg.length(); i++)
            emsg = emsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(emsg);

        for(int i = 0; i < msg.length(); i++)
            demsg = demsg + (char) (emsg.charAt(i) ^ key);

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(demsg);
    }
}
