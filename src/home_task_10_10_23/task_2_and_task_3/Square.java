package home_task_10_10_23.task_2_and_task_3;

public class Square extends Figure implements IPrintable{
    private double side;

    public Square(double side) {
        super("Квадрат");
        this.side = side;
    }

    @Override
    public double countSquare() {
        return side * side;
    }

    @Override
    public double countPerimeter() {
        return 4 * side;
    }

    @Override
    public String getCalculatedParameters() {
        return "Длина стороны: " + side;
    }

    @Override
    public void print() {
        // Реализация вывода фигуры Прямоугольник символами (например,  ⧠)
        System.out.println("Фигура: Квадрат");
    }
}
