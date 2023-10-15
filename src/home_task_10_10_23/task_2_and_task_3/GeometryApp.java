package home_task_10_10_23.task_2_and_task_3;

import java.util.Scanner;

//2 Необходимо написать консольное приложение с объектно-ориентированной архитектурой,
// выводящее характеристики заданной пользователем геометрической фигуры.
// Пользователь вводит имя фигуры и её параметры одной строкой. Результатом работы приложения
// являются вычисленные характеристики.
// Парсинг введённой пользователем строки выполните в отдельном утилитарном классе.
//(таблицу входных и выходных данных см. в презентации)
public class GeometryApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите фигуру и параметры (например, 'круг 5' или 'прямоугольник 4 6'): ");
        String input = scan.nextLine();

        Figure figure = ParseFigure.parseString(input);

        if (figure != null) {
            double square = figure.countSquare();
            double perimeter = figure.countPerimeter();

            System.out.println("Название: " + figure.getName());
            System.out.println("Площадь: " + square);
            System.out.println("Периметр: " + perimeter);
            System.out.println("Вычисляемые параметры:" + figure.getCalculatedParameters());
        }
        // Создаем массив фигур
        IPrintable[] figures = {
                new Cycle(5),
                new Rectangle(4, 6),
                new Square(8),
                new Triangle(3, 4, 5)
        };
        // В цикле вызываем метод print для каждой фигуры
        for (IPrintable printable : figures) {
            printable.print();
        }

    }
}
