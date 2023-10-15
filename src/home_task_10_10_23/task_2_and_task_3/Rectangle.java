package home_task_10_10_23.task_2_and_task_3;

public class Rectangle extends Figure implements IPrintable{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Прямоугольник");
        this.length = length;
        this.width = width;
    }


    @Override
    public double countSquare() {
        return length * width;
    }

    @Override
    public double countPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getCalculatedParameters() {
        double diagonal = Math.sqrt(length * length + width * width);
        return "Длина диагонали: " + diagonal + ", Длина: " + length + ", Ширина: " + width;
    }

    @Override
    public void print() {
        // Реализация вывода фигуры Прямоугольник символами (например,  ⧠)
        System.out.println("Фигура: Прямоугольник");
    }
}
