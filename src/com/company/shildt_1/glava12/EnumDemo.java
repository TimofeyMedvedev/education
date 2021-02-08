package com.company.glava12;

enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed;

    Transport(int s) {
        speed = s;
    }
    int getSpeed() {
        return speed;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("Типичная скорость самолёта: " +
                Transport.AIRPLANE.getSpeed() + " миль в час\n");
        System.out.println("Типичные скорости движения транспортных средств");
        for(Transport t : Transport.values())
            System.out.println(t + ": " + t.getSpeed() + " миль в час");
    }
}
