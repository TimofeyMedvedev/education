package com.company.glava9;

public class Excample2 {
    public static void main(String[] args) {
        int n[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < n.length; i++) {
            try {
                System.out.println(n[i] + " / " + d[i] + " равно " + n[i] / d[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден");
            }
            catch (Throwable exc) {
                System.out.println("Возникло исключение!");
            }
        }
    }
}
