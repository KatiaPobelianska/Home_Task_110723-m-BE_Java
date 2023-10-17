package home_task_17_10_23.task_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Напишите метод, который убирает из списка целых чисел все дубликаты.
public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(56);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);
        numbers.add(14);
        numbers.add(77);
        numbers.add(77);

        List<Integer> uniqueNumbersList = removeDuplicates(numbers);
        System.out.println(uniqueNumbersList);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
}
