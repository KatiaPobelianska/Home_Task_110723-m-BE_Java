package home_task_23_10_23.task_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

//Напишите программу Завтрак у бабушки. Бабушка жарит блинчик и кладёт его сверху на стопку.
// Внук может скушать только верхний блинчик. В цикле смоделируйте, что за одну итерацию бабушка
// жарит 2 блинчика, а внук съедает только один. Когда внук наелся.
// Цикл заканчивается. Количество блинов, которые может съесть внук равно его возрасту.
public class BreakfastAtGrandma {
    public static void main(String[] args) {
        int grandsonAge = 5; // Возраст внука (количество блинов, которые он может съесть)

        Deque<String> pancakesStack = new ArrayDeque<>();
        // Бабушка начинает жарить блинчики и добавляет их в стек
        for (int i = 1; i <= grandsonAge; i++){
            String pancake = "Блинчик " + i;
            pancakesStack.push(pancake);
            System.out.println("Бабушка приготовила и добавила " + pancake + " сверху на стопку");
        }
        // Внук начинает есть блинчики
        while (!pancakesStack.isEmpty()){
            String pancakeToEat = pancakesStack.pop();
            System.out.println("Внук съел " + pancakeToEat);
            if (!pancakesStack.isEmpty()) {
                System.out.println("Внук возьмет следующий блинчик.");
            } else {
                System.out.println("Все блинчики съедены. Завтрак завершен.");
            }
        }

    }
}
