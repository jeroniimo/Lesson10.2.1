package org.example;
//интерфейс
public interface GeometricShape {
    //  периметр и площадь
    default double getPerimeter() {
        return 0;
    }

    default double getArea() {
        return 0;
    }

    // цвет фона и границы
    void setFillColor(String color);
    void setBorderColor(String color);
    String getFillColor();
    String getBorderColor();

    // информации о фигуре
    default void printInfo() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет фона: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}