package com.company.glava14;
import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
        if(isEven.test(4))
            System.out.println("4 - четное число");
        if(!isEven.test(5))
            System.out.println("5 - нечетное число");
    }
}
