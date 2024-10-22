// Класс Circle, реализующий интерфейс Shape
public class Circle implements Shape {
    private double radius; // Радиус круга
    private String fillColor; // Цвет заливки
    private String borderColor; // Цвет границы

    // Конструктор класса, инициализирует радиус, цвет заливки и цвет границы
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius; // Присваиваем радиус
        this.fillColor = fillColor; // Присваиваем цвет заливки
        this.borderColor = borderColor; // Присваиваем цвет границы
    }

    // Реализация метода для расчета площади круга
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Формула площади: πr²
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

    // Переопределение метода для расчета периметра (длина окружности)
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Формула периметра: 2πr
    }
}