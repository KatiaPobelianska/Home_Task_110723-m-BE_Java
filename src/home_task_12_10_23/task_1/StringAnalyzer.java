package home_task_12_10_23.task_1;

import java.util.ArrayList;
import java.util.Scanner;

//Создайте программу, которая принимает от пользователя неограниченное количество строк.
// Ввод строк должен закончится, когда пользователь введёт слово quit. Выведите в консоль
// все строки, которые ввёл пользователь. Реализуйте два метода – один находит самую длинную строку
// в списке, второй – самую короткую строку.
// Выведите самую длинную и самую короткую из строк в консоль.
public class StringAnalyzer {
    public static void main(String[] args) {
// Создайте программу, которая принимает от пользователя неограниченное количество строк
        Scanner scan = new Scanner(System.in);
        ArrayList<String> inputStrings = new ArrayList<>();

        System.out.println("Введите строки (для завершения введите 'quit'):");
// Ввод строк должен закончится, когда пользователь введёт слово quit. Выведите в консоль
// все строки, которые ввёл пользователь.
        String input;
        while (true) {
            input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            inputStrings.add(input);
        }

        System.out.println("Введенные строки:");
        for (String s : inputStrings) {
            System.out.println(s);
        }
// Выведите самую длинную и самую короткую из строк в консоль
        if (!inputStrings.isEmpty()) {
            String longestString = findLongestString(inputStrings);
            String shortestString = findShortestString(inputStrings);

            System.out.println("Самая длинная строка: " + longestString);
            System.out.println("Самая короткая строка: " + shortestString);
        } else {
            System.out.println("Список строк пуст.");
        }
    }

// Реализуйте два метода
    private static String findLongestString(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return null;
        }
        String longest = strings.get(0);
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    private static String findShortestString(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return null;
        }
        String shortest = strings.get(0);
        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
}
