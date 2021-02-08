package com.company.glava7;

class TwoDShape3 {
    private double width;
    private double height;

    TwoDShape3() {
        width = height = 0.0;
    }
    TwoDShape3(double w, double h) {
        width = w;
        height = h;
    }
    TwoDShape3(double x) {
        width = height = x;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

class Triangle3 extends TwoDShape3 {
    private String style;

    Triangle3() {
        super();
        style = "none";
    }
    Triangle3(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    Triangle3(double x) {
        super(x);
        style = "закрашенный";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

public class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3();
        Triangle3 t2 = new Triangle3("контурный", 8.0, 12.0);
        Triangle3 t3 = new Triangle3(4.0);

        t1 = t2;

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());
    }
}
