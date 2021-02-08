package com.company.glava11;

class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]) {
        sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы для " + Thread.currentThread().getName() + ": " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        return sum;
    }
}

class MuThread implements Runnable {
    Thread th;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MuThread(String name, int nums[]) {
        th = new Thread(this, name);
        a = nums;
        th.start();
    }

    public void run() {
        int sum;
        System.out.println(th.getName() + " - запуск");

        answer = sa.sumArray(a);
        System.out.println("СУММА для " + th.getName() + ": " + answer);
        System.out.println(th.getName() + " - завершение");
    }
}

public class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MuThread m1 = new MuThread("Child #1", a);
        MuThread m2 = new MuThread("Child #2", a);
    }
}
