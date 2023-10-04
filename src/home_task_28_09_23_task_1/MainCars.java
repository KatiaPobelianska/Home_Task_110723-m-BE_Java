package home_task_28_09_23_task_1;

public class MainCars {
    public static void main(String[] args) {
        // Создаем спорткар
        Car sportCar = Factory.produceSportCar("Ferrari", "488 GTB", 670);
        sportCar.Information();

        // Создаем грузовик
        Car truckCar = Factory.produceTruck("Volvo", "FH16", 750);
        truckCar.Information();

        // Создаем легковой автомобиль
        Car car = Factory.produceCar("Toyota", "Camry", 203);
        car.Information();
    }
}
