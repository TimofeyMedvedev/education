package com.company.glava7;

class TwoDShapee {
    private double width;
    private double height;
    private String name;

    TwoDShapee() {
        width = height = 0.0;
        name = "none";
    }
    TwoDShapee(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    TwoDShapee(double x, String n) {
        width = height = x;
        name = n;
    }
    TwoDShapee(TwoDShapee ob) {
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
    double area() {
        System.out.println("Метод area() должен быть переопределен");
        return 0.0;
    }
}

class Trianglee extends TwoDShapee {
    private String style;

    Trianglee() {
        super();
        style = "none";
    }
    Trianglee(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }
    Trianglee(double x) {
        super(x, "треугольник");
        style = "закрашенный";
    }
    Trianglee(Trianglee ob) {
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

class Rectangle extends TwoDShapee {
    Rectangle() {
        super();
    }
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }
    Rectangle(double x) {
        super(x, "прямоугольник");
    }
    Rectangle(Rectangle ob) {
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

public class DynShapes {
    public static void main(String[] args) {
        TwoDShapee shapes[] = new TwoDShapee[5];
        shapes[0] = new Trianglee("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Trianglee(7.0);
        shapes[4] = new TwoDShapee(10, 20, "фигура");

        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Объект - " + shapes[i].getName());
            System.out.println("Площадь - " + shapes[i].area());
            System.out.println();
        }
    }
}