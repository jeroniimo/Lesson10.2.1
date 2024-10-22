// Основной класс, содержащий метод main для запуска программы
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры фигур с параметрами
        Shape circle = new Circle(5, "Red", "Black"); // Круг с радиусом 5, красным цветом заливки и черной границей
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green"); // Прямоугольник 4x6 с синим цветом заливки и зеленой границей
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple"); // Треугольник со сторонами 3, 4, 5, желтым цветом заливки и фиолетовой границей

        // Массив фигур для итерации
        Shape[] shapes = {circle, rectangle, triangle};

        // Итерация по массиву фигур и вывод характеристик каждой из них
        for (Shape shape : shapes) {
            System.out.println("Фигура: " + shape.getClass().getSimpleName()); // Выводим имя класса фигуры
            System.out.println("Цвет заливки: " + shape.getFillColor()); // Выводим цвет заливки
            System.out.println("Цвет границы: " + shape.getBorderColor()); // Выводим цвет границы
            System.out.println("Периметр: " + shape.getPerimeter()); // Выводим периметр фигуры
            System.out.println("Площадь: " + shape.getArea()); // Выводим площадь фигуры
            System.out.println(); // Пустая строка для разделения выводов
        }
    }
}