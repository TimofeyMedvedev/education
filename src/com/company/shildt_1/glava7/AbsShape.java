package com.company.glava7;

abstract class TwoDShape6 {
    private double width;
    private double height;
    private String name;

    TwoDShape6() {
        width = height = 0.0;
        name = "none";
    }
    TwoDShape6(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    TwoDShape6(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShape6(TwoDShape6 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
    abstract double area();
}

class Triangle6 extends TwoDShape6 {
    private String style;

    Triangle6() {
        super();
        style = "none";
    }
    Triangle6(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }
    Triangle6(double x) {
        super(x, "треугольник");
        style = "закрашенный";
    }
    Triangle6(Triangle6 ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangle6 extends TwoDShape6 {
    Rectangle6() {
        super();
    }
    Rectangle6(double w, double h) {
        super(w, h, "прямоугольник");
    }
    Rectangle6(double x) {
        super(x, "прямоугольник");
    }
    Rectangle6(Rectangle6 ob) {
        super(ob);
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}

class Circle extends TwoDShape6 {
    Circle() { super(); }
    Circle(double x) { super(x, "circle"); }
    Circle(Circle ob) { super(ob); }
    double area() { return (getWidth() / 2) * (getWidth() / 2) * 3.1416; }
}

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape6 shapes[] = new TwoDShape6[4];
        shapes[0] = new Triangle6("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle6(10);
        shapes[2] = new Rectangle6(10, 4);
        shapes[3] = new Triangle6(7.0);

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}