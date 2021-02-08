package com.company.glava1_3;

public class Help3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;
        for(;;) {
        do {
            System.out.print("Справка:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\n");
            System.out.print("6. break\n7. continue\nВыберите (q - выход): ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }   while(ignore != '\n');
        } while(ch < '1' | ch > '7' & ch != 'q');

        if(ch == 'q') break;

        System.out.print("\n");

         switch (ch) {
            case '1':
                System.out.println("Оператор if:\nif(условие) оператор;\nelse оператор;\n");
                break;
            case '2':
                System.out.println("Оператор switch:\nswitch(выражение) {\n case константа:");
                System.out.println(" последовательность операторов\n break;\n \\ ...\n}\n");
                break;
            case '3':
                System.out.println("Оператор for:\nfor(инициализация; условие; итерация)\n оператор;\n");
                break;
            case '4':
                System.out.println("Оператор while:\nwhile(условие) оператор;\n");
                break;
            case '5':
                System.out.println("Оператор do-while:\ndo {\n оператор;\n} while(условие);\n");
                break;
            case '6':
                System.out.println("Оператор break:\nbreak; или break метка;\n");
                break;
            case '7':
                System.out.println("Оператор continue:\ncontinue; или continue метка;\n");
                break;
         }
        }
    }
}
