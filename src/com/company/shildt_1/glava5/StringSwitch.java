package com.company.glava5;

public class StringSwitch {
    public static void main(String[] args) {

        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            case "disconneсt":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Неверная команда");
                break;
        }
    }
}
