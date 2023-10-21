package home_task_19_10_23.task_3;

import java.util.Iterator;
import java.util.TreeSet;
//// Создайте итератор по массиву целых чисел, который будет выводить элементы в порядке их убывания.
//// Исходный массив не должен при этом измениться.
public class Main {
    public static void main(String[] args) {
        int numbers[] = {-12, 777, 56, 0, 36, 89, -4};

        // Создаем TreeSet с компаратором для сортировки по убыванию
        TreeSet<Integer> treeSet = new TreeSet<>((a, b) -> b - a);

        for (int value : numbers) {
            treeSet.add(value);
        }

        Iterator<Integer> descendingIterator = treeSet.descendingIterator();

        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
//        ==========================================
        ReverseArrayIterator iterator = new ReverseArrayIterator(numbers);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

