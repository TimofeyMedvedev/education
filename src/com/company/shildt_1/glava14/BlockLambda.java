package com.company.glava14;

interface NumericFunc {
    int func(int i);
}

public class BlockLambda {
    public static void main(String[] args) {
        NumericFunc nFunc = (n) -> {
            int result = 1;
            n = n < 0 ? -n : n;

            for(int i = 2; i <= n/i; i++)
                if((n % i) == 0) {
                    result = i;
                    break;
                }
            return result;
        };
        System.out.println("Наимешьним делителем 12 является " + nFunc.func(12));
        System.out.println("Наимешьним делителем 11 является " + nFunc.func(11));
    }
}
