package com.company.glava6;

class ErrorMsg {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else return "Несуществующий код ошибки";
    }
}

public class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg ms = new ErrorMsg();

        System.out.println(ms.getErrorMsg(2));
        System.out.println(ms.getErrorMsg(19));
    }
}
