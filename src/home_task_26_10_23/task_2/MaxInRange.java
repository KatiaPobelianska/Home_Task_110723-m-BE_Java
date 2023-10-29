package home_task_26_10_23.task_2;

import java.util.Arrays;
import java.util.List;

/* 2. Напишите параметризированный метод для нахождения максимального элемента в диапазоне
 [begin, end) среди элементов List.
 Какую границу должен иметь параметр такого метода?*/
public class MaxInRange {
    public static <T extends Comparable<? super T>> T findMaxInRange(List<T> list, int begin, int end) {
        if (list == null || begin < 0 || end > list.size() || begin >= end) {
            throw new IllegalArgumentException("Некорректные аргументы");
        }

        T max = list.get(begin);

        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 4, 6, 7);
        int maxInRange = findMaxInRange(numbers, 2, 6);
        System.out.println("Максимальный элемент в диапазоне [2, 6): " + maxInRange);
    }
}
