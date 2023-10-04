package home_task_28_09_23_task_1;

public class Factory {
    // Метод для производства спорткара
    public static Car produceSportCar(String brand, String model, int power) {
        return new Car(CarTypes.SPORTCAR, brand, model, power);
    }

    // Метод для производства грузовика
    public static Car produceTruck(String brand, String model, int power){
    return new Car(CarTypes.TRUCK, brand, model, power);
    }
    // Метод для производства легкового автомобиля
    public static Car produceCar(String brand, String model, int power){
        return new Car(CarTypes.CAR, brand, model, power);
    }
}

