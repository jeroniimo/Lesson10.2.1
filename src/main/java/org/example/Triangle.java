package org.example;

public class Triangle implements GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;
//длина
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
//периметр
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        // расчет площади S = p(p − a)(p − b)(p − c)
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
//цвет фона метод
    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }
//цвет границ метод
    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
//получение цвета
    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}