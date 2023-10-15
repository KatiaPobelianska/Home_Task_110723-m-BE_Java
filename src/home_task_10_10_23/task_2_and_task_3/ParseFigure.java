package home_task_10_10_23.task_2_and_task_3;

public class ParseFigure {
    public static Figure parseString(String string){
        String[] elements = string.split(" ");
        if (elements.length < 1) {
            return null; // Если строка пуста или не содержит название фигуры, вернем null
        }
        String name = elements[0].toLowerCase();
        switch (name){
            case "круг":
                if (elements.length < 2) {
                    return null; // Круг требует радиус
                }
                double radius = Double.parseDouble(elements[1]);
                return new Cycle(radius);
            case "прямоугольник":
                if (elements.length < 3) {
                    return null; // Прямоугольник требует длину и ширину
                }
                double length = Double.parseDouble(elements[1]);
                double width = Double.parseDouble(elements[2]);
                return new Rectangle(length, width);
            case "треугольник":
                if (elements.length < 4) {
                    return null; // Треугольник требует длины трех сторон
                }
                double side1 = Double.parseDouble(elements[1]);
                double side2 = Double.parseDouble(elements[2]);
                double side3 = Double.parseDouble(elements[3]);
                return new Triangle(side1, side2, side3);
            case "квадрат":
                if (elements.length < 2) {
                    return null; // Квадрат требует длину стороны
                }
                double side = Double.parseDouble(elements[1]);
                return new Square(side);

            default:
                return null; // Неизвестная фигура
        }
    }
}
