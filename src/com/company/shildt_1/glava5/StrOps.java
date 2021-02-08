package com.company.glava5;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - лидер Интернета!";
        String str2 = new String(str1);
        String str3 = "Строки Java эффективны";

        int result, idx;
        char ch;

        String substr = str1.substring(7, 23);
        System.out.println("str1: " + str1);
        System.out.println("subst: " + substr);

        System.out.println("\nДлина str1: " + str1.length());

        for(int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 эквивалента str2");
        else
            System.out.println("str1 не эквивалента str2");

        if(str1.equals(str3))
            System.out.println("str1 эквивалента str3");
        else
            System.out.println("str1 не эквивалента str3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 и str3 равны");
        else if(result < 0)
            System.out.println("str1 меньше str3");
        else
            System.out.println("str1 больше str3");

        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);
    }
}
