package com.company.glava9;

class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Результат операции " + n + " / " + d + " не является целым числом";
    }
}

class CustomExceptDemo {
    public static void main(String[] args) {
        int n[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < n.length; i++) {
            try {
                if ((n[i] % 2) != 0)
                    throw new NonIntResultException(n[i], d[i]);
                System.out.println(n[i] + " / " + d[i] + " равно " + n[i] / d[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Попытка деления на нуль!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
