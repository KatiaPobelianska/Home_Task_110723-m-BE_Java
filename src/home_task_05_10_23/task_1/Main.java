package home_task_05_10_23.task_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Генерация слова из букв английского алфавита
        String randomWord = StringUtil.generateWord(5);
        System.out.println("Сгенерированное слово: " + randomWord);

        // Генерация строки из цифр
        String randomNumericString = StringUtil.generateNumeric(4);
        System.out.println("Сгенерированная строка из цифр: " + randomNumericString);

        // Разделение строки по первому символу, который не является буквой или цифрой
        String inputString = "Я люблю Java!";
        String[] splitResult = StringUtil.splitByFirst(inputString);
        System.out.println("Результат разделения строки:");
        for (String part : splitResult) {
            System.out.println(part);
        }

        // Проверка, является ли строка числом
        String numericString = "12345";
        String nonNumericString = "abc123";
        System.out.println("Проверка, является ли строка числом:");
        System.out.println(numericString + " - " + StringUtil.isNumeric(numericString));
        System.out.println(nonNumericString + " - " + StringUtil.isNumeric(nonNumericString));
    }
}