package home_task_23_10_23.task_3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//Создайте программу-переводчик с английского языка.
// Пользователь вводит слово на английском языке, переводчик показывает перевод.
// Если переводчик не обнаружил в словаре введённое слово, то он просит пользователя ввести перевод,
// после чего сохраняет слово и его перевод в словарь.
// Программа продолжается, пока пользователь не введёт stopTranslate.
public class EnglishTranslator {
    public static void main(String[] args) {
        Deque<String> dictionary = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите слово на английском (или 'stopTranslate' для завершения): ");
            String word = scanner.nextLine();

            if (word.equals("stopTranslate")) {
                System.out.println("Game over");
                break;
            }
            String translation = dictionary.pollFirst();
            if (translation != null) {
                System.out.println("Перевод: " + translation);
            } else {
                System.out.print("Слово не найдено в словаре. Введите перевод: ");
                translation = scanner.nextLine();
                dictionary.offerLast(translation);
                dictionary.offerLast(word);
                System.out.println("Слово и его перевод добавлены в словарь.");
            }
        }

    }
}
