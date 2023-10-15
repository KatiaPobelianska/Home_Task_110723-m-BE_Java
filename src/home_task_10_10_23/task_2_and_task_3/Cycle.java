package home_task_10_10_23.task_2_and_task_3;

public class Cycle extends Figure implements IPrintable{
    private double radius;

    public Cycle(double radius){
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double countSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getCalculatedParameters() {
        double diameter = 2 * radius;
        return "Радиус: " + radius + ", Диаметр: " + radius;
    }
    @Override
    public void print() {
        // Реализация вывода фигуры Круг символами (например, ◍)
        System.out.println("Фигура: Круг");
    }
}
