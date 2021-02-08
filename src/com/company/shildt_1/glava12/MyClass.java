package com.company.glava12;
@Deprecated
class AnnoDem {
    private String msg;

    AnnoDem (String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }
}

class MyClass {
    public static void main(String[] args) {
        AnnoDem obj = new AnnoDem("тест");
        System.out.println(obj.getMsg());
    }
}