package home_task_28_09_23_task_1;

public class Car {
    public CarTypes typ;
    String brand;
    private String model;
    private int power;

    // Constructor


    public Car(CarTypes typ, String brand, String model, int power) {
        this.typ = typ;
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    //    Getter for model
    public String getModel() {
        return model;
    }

//    Setter for power
    public void setPower(int power) {
        this.power = power;
    }

//  Information
    public void Information() {
        System.out.println("Тип: " + typ);
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Мощность двигателя: " + power + " лошадиных сил");


    }
}

