package home_task_26_10_23.task_1;

import java.util.Arrays;

/*
1. Напишите параметризированный метод для обмена позициями двух разных элементов в массиве.
Метод принимает параметризированный массив и индексы элементов, которые нужно обменять.
* */
public class Swap {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            // Проверка на некорректные аргументы
            return;
        }
        T temp = array[index1];  // Сохраняем элемент, находящийся в index1
        array[index1] = array[index2];  // Заменяем элемент в index1 на элемент из index2
        array[index2] = temp;  // Заменяем элемент в index2 сохраненным элементом
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers)); // Выведет: [1, 4, 3, 2, 5]
    }
}