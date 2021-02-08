package com.company.glava7;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4() {
        width = height = 0.0;
    }
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }
    TwoDShape4(double x) {
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

class Triangle4 extends TwoDShape3 {
    private String style;

    Triangle4() {
        super();
        style = "none";
    }
    Triangle4(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    Triangle4(double x) {
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

class ColorTriangle extends Triangle4 {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }
    String getColor() { return color; }
    void showColor() {
        System.out.println("Цвет - " + color);
    }
}

public class Shapes4 {
    public static void main(String[] args) {
        ColorTriangle t1 = new ColorTriangle("Синий", "контурный", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Площадь - " + t2.area());
    }
}