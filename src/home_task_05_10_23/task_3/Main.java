package home_task_05_10_23.task_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bicycle roadBike = new Bicycle(BicycleType.ROAD, 2, 15, "Red", 800);
        Bicycle mountainBike = new Bicycle(BicycleType.MOUNTAIN, 2, 18, "Grey", 1500);
        Bicycle kidsBike = new Bicycle(BicycleType.KIDS, 3, 10, "Orange", 700);

        System.out.println(roadBike);
        System.out.println(mountainBike);
        System.out.println(kidsBike);

        // Создаем массив велосипедов
        Bicycle[] bicycles = {roadBike, mountainBike, kidsBike};

        // Преобразуем массив в строку и выводим в консоль

        String bicyclesAsString = Arrays.toString(bicycles);
        System.out.println("Array of bicycles: ");
        System.out.println(bicyclesAsString);

    }
}
//================= МОЙ ОТВЕТ НА СЛЕДУЮЩИЙ ВОПРОС:
//Перейдите в код метода Arrays.toString() и посмотрите на его реализацию.
// В какой момент автомобиль становится строкой внутри этого метода?

//====каждый объект Bicycle становится строкой,
// когда метод Arrays.toString() вызывает их метод toString() для создания окончательной строки, которую он выводит.