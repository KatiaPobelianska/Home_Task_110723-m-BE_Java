package home_task_05_10_23.task_3;



public class Bicycle {
   private BicycleType bicycleType;
   private int wheels;
   private int gears;
   private String color;
   private double price;

    public Bicycle(BicycleType bicycleType, int wheels, int gears, String color, double price) {
        this.bicycleType = bicycleType;
        this.wheels = wheels;
        this.gears = gears;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "bicycleType=" + bicycleType +
                ", wheels=" + wheels +
                ", gears=" + gears +
                ", color='" + color + '\'' +
                ", price $=" + price +
                '}';
    }
}