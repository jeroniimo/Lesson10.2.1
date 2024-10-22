package org.example;
public class Triangle implements Shape {
    private double sideA; // Сторона A
    private double sideB; // Сторона B
    private double sideC; // Сторона C
    private String fillColor; // Цвет заливки
    private String borderColor; // Цвет границы

    // Конструктор класса, инициализирует стороны, цвет заливки и цвет границы
    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA; // Присваиваем сторону A
        this.sideB = sideB; // Присваиваем сторону B
        this.sideC = sideC; // Присваиваем сторону C
        this.fillColor = fillColor; // Присваиваем цвет заливки
        this.borderColor = borderColor; // Присваиваем цвет границы
    }

    // Реализация метода для расчета площади треугольника с использованием формулы Герона
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // Полупериметр
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула Герона
    }

    // Реализация метода для получения цвета заливки
    @Override
    public String getFillColor() {
        return fillColor; // Возвращаем цвет заливки
    }

    // Реализация метода для получения цвета границы
    @Override
    public String getBorderColor() {
        return borderColor; // Возвращаем цвет границы
    }

    // Переопределение метода для расчета периметра
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC; // Формула периметра: a + b + c
    }
}