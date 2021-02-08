package com.company.glava1_3;

public class Help {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;

        System.out.print("Справка:\n1. if\n2. switch\nВыберите: ");
        ch = (char) System.in.read();
        System.out.print("\n");

        switch (ch) {
            case '1':
                System.out.println("Оператор if:\n\nif(условие) оператор;\nelse оператор;\n");
                break;
            case '2':
                System.out.println("Оператор switch:\n\nswitch(выражение) {\n case константа:");
                System.out.println(" последовательность операторов\n break;\n \\ ...\n}");
                break;
            default:
                System.out.print("Запрос не найден.");
        }
    }
}
