package org.example;
public class Rectangle implements Shape {
    private double width; // Ширина прямоугольника
    private double height; // Высота прямоугольника
    private String fillColor; // Цвет заливки
    private String borderColor; // Цвет границы

    // Конструктор класса, инициализирует ширину, высоту, цвет заливки и цвет границы
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width; // Присваиваем ширину
        this.height = height; // Присваиваем высоту
        this.fillColor = fillColor; // Присваиваем цвет заливки
        this.borderColor = borderColor; // Присваиваем цвет границы
    }

    // Реализация метода для расчета площади прямоугольника
    @Override
    public double getArea() {
        return width * height; // Формула площади: ширина * высота
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
        return 2 * (width + height); // Формула периметра: 2 * (ширина + высота)
    }
}