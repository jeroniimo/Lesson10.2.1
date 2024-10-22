package org.example;
// Интерфейс Shape
public interface Shape {
    // Метод для получения площади фигуры
    double getArea();

    // Метод для получения цвета заливки
    String getFillColor();

    // Метод для получения цвета границы
    String getBorderColor();

    // Дефолтный метод для расчета периметра (можно переопределить в классах)
    default double getPerimeter() {
        return 0; // Возвращаем 0 по умолчанию, если не переопределено
    }
}