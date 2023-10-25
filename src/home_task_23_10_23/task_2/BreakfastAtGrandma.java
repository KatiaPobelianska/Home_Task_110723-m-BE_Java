package home_task_23_10_23.task_2;

import java.util.LinkedList;
import java.util.Queue;

//Напишите программу Завтрак у бабушки. Бабушка жарит блинчик и кладёт его сверху на стопку.
// Внук может скушать только верхний блинчик. В цикле смоделируйте, что за одну итерацию бабушка
// жарит 2 блинчика, а внук съедает только один. Когда внук наелся.
// Цикл заканчивается. Количество блинов, которые может съесть внук равно его возрасту.
public class BreakfastAtGrandma {
    public static void main(String[] args) {
        int ageOfGrandson = 5;
        int pancakesEaten = 0;

        Queue<String> pancakes = new LinkedList<>();

        System.out.println("Begin of breakfast by grandma");
        for (int i = 0; i < ageOfGrandson * 2; i++) {
            pancakes.offer("Pancake#" + (i + 1));
        }
//
        while (pancakesEaten < ageOfGrandson) {
            String pancake = pancakes.poll();
            System.out.println("Grandson has eaten " + pancake);
            pancakesEaten++;
            if(pancakes.isEmpty()){
                System.out.println("Grandma makes pancakes no more");
                break;
            }
        }


    }
}
