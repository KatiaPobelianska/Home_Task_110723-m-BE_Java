package home_task_10_10_23.task_2_and_task_3;

public abstract class Figure {
    private String name;

    public Figure(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double countSquare();

   public abstract double countPerimeter();

    public abstract String getCalculatedParameters();

    public abstract void print();
}
