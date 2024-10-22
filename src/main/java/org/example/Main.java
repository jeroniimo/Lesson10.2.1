package org.example;

public class Main {
    public static void main(String[] args) {
        //  круг
        Circle circle = new Circle(10);
        circle.setFillColor("Красный");
        circle.setBorderColor("Белый");
        System.out.println("Круг:");
        circle.printInfo();
        System.out.println("----------------");

        // прямоугольник
        Rectangle rectangle = new Rectangle(15, 18);
        rectangle.setFillColor("Синий");
        rectangle.setBorderColor("Зеленый");
        System.out.println("Прямоугольник:");
        rectangle.printInfo();
        System.out.println("---------------------");

        // треугольник
        Triangle triangle = new Triangle(9, 8, 12);
        triangle.setFillColor("Желтый");
        triangle.setBorderColor("Фиолетовый");
        System.out.println("Треугольник:");

        triangle.printInfo();
    }
}