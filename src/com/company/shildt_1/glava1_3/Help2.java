package com.company.glava1_3;

public class Help2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore;

        do {
            System.out.print("Справка:\n1. if\n2. switch\n3. for\n4. while\n5. do-while\nВыберите: ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }   while(ignore != '\n');
        } while(ch < '1' | ch > '5');

        System.out.print("\n");

        switch (ch) {
            case '1':
                System.out.println("Оператор if:\nif(условие) оператор;\nelse оператор;\n");
                break;
            case '2':
                System.out.println("Оператор switch:\nswitch(выражение) {\n case константа:");
                System.out.println(" последовательность операторов\n break;\n \\ ...\n}");
                break;
            case '3':
                System.out.println("Оператор for:\nfor(инициализация; условие; итерация)\n оператор");
                break;
            case '4':
                System.out.println("Оператор while:\nwhile(условие) оператор;");
                break;
            case '5':
                System.out.println("Оператор do-while:\ndo {\n оператор;\n} while(условие);");
                break;
        }
    }
}
