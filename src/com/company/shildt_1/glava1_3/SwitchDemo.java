package com.company.glava1_3;

public class SwitchDemo {
    public static void main(String[] args) {
    int i;

    for(i = 0; i < 10; i++)
        switch(i) {
            case 0:
                System.out.println("i равно нулю");
                break;
            case 1:
                System.out.println("i равно единице");
                break;
            case 2:
                System.out.println("i равно двум");
                break;
            case 3:
                System.out.println("i равно трём");
                break;
            case 4:
                System.out.println("i равно четырём");
                break;
            default:
                System.out.println("i равно или больше пяти");
                break;
        }
    }
}
