package com.company.javarush.uroven23;

/*
Проверка номера телефона
*/

public class Solution2 {
    public static boolean checkTelNumber(String telNumber) {
        if(telNumber == null || telNumber.isEmpty()) {
            return false;
        }
        int length = telNumber.replaceAll("\\D", "").length();
        if(length == 12) {
            return telNumber.matches("(^\\+)\\d*(\\(\\d{3}\\))?\\d*\\-?\\d+\\-?\\d*\\d$");
        }
        else if(length == 10) {
            return telNumber.matches("^(\\d|(\\(\\d{3}\\)))\\d*\\-?\\d+\\-?\\d*\\d$");
        }
        return false;
    }

    public static void main(String[] args) {
        String[] str = {"+380501234567", "+38(050)1234567", "+38050123-45-67", "+38050(123)-454-3", "+38-98(090)-98712",
        "050123-4567", "(050)-123-4567", "05(234)2-23-45", "-69943-34567", "09(344)-34-223"};
        for(String s : str) {
            System.out.println(checkTelNumber(s));
        }
    }
}