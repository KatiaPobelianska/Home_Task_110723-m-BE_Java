package home_task_10_10_23.task_2_and_task_3;

public class Triangle extends Figure implements IPrintable{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        super("Треугольник");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double countSquare() {
        // Используем полу-периметр и формулу Герона для вычисления площади
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double countPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String getCalculatedParameters() {
        // Вычисляем углы с использованием закона косинусов
        double angle1 = Math.toDegrees(Math.acos((side2 * side2 + side3 * side3 - side1 * side1) / (2 * side2 * side3)));
        double angle2 = Math.toDegrees(Math.acos((side1 * side1 + side3 * side3 - side2 * side2) / (2 * side1 * side3)));
        double angle3 = 180 - angle1 - angle2;

        return "Длины сторон: " + side1 + ", " + side2 + ", " + side3 + "\n" +
                "Противолежащие углы: " + angle1 + "°, " + angle2 + "°, " + angle3 + "°";
    }

    @Override
    public void print() {
        // Реализация вывода фигуры Треугольник символами (например,  △)
        System.out.println("Фигура: Треугольник");
    }


}

