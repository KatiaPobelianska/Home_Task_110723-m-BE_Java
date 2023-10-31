package home_task_23_10_23.task_3;

import java.util.*;

//Создайте программу-переводчик с английского языка.
// Пользователь вводит слово на английском языке, переводчик показывает перевод.
// Если переводчик не обнаружил в словаре введённое слово, то он просит пользователя ввести перевод,
// после чего сохраняет слово и его перевод в словарь.
// Программа продолжается, пока пользователь не введёт stopTranslate.
public class EnglishTranslator {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа-переводчик с английского языка. Для завершения введите 'stopTranslate'.");

        while (true){
            System.out.println("Введите слово на английском: ");
            String englishWord = scanner.nextLine();

            if (englishWord.equals("Stop translate")) break;

            if (dictionary.containsKey(englishWord)){
                String translation = dictionary.get(englishWord);
                System.out.println("Перевод: " + translation);
            }else {
                System.out.println("Слово не найдено в словаре. Введите перевод: ");
                String translation = scanner.nextLine();
                dictionary.put(englishWord, translation);
                System.out.println("Слово и его перевод добавлены в словарь.");
            }
            System.out.println("Программа завершена");
        }
    }
}