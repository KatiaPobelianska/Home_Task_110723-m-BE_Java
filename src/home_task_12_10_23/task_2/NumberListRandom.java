package home_task_12_10_23.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Напишите метод, который создаёт список с произвольным количеством элементов.
// Список должен быть заполнен случайными числами в диапазоне от -100 до 100 включительно.
// Напишите второй метод, который принимает список чисел и удаляет из него все отрицательные числа.
// В main вызовите оба метода.
public class NumberListRandom {
    public static void main(String[] args) {
        List<Integer> numberListRandom = createRandomNumberList(10);
        System.out.println("Сгенерированный список:");
        System.out.println(numberListRandom);

        removeNegativeNumbers(numberListRandom);
        System.out.println("Список после удаления отрицательных чисел:");
        System.out.println(numberListRandom);

    }

    // Метод для создания списка случайных чисел
    private static List<Integer> createRandomNumberList(int quantity) {
        List<Integer> numberList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantity; i++) {
            int randomNumber = random.nextInt(201) - 100;// Генерируем случайное число от -100 до 100
            numberList.add(randomNumber);
        }
        return numberList;
    }

    // Метод для удаления отрицательных чисел из списка
    public static void removeNegativeNumbers(List<Integer> numberList) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer numb : numberList) {
            if (numb >= 0) {
                positiveNumbers.add(numb);
            }
        }
        numberList.clear();
        numberList.addAll(positiveNumbers);
    }
}
