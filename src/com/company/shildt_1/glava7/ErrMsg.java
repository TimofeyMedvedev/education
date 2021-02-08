package com.company.glava7;

class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

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

        System.out.println(ms.getErrorMsg(ms.OUTERR));
        System.out.println(ms.getErrorMsg(ms.DISKERR));
    }
}
