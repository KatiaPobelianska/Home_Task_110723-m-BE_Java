package home_task_05_10_23.task_1;

public class StringUtil {
    // Приватный конструктор по умолчанию, чтобы предотвратить создание экземпляров класса
    private StringUtil() {}

    // Метод для генерации строки заданной длины, состоящей только из букв английского алфавита
    public static String generateWord(int length) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) ('a' + Math.random() * ('z' - 'a' + 1));
            word.append(randomChar);
        }
        return word.toString();
    }

    // Метод для генерации строки заданной длины, состоящей из цифр
    public static String generateNumeric(int length) {
        StringBuilder numericString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomDigit = (int) (Math.random() * 10);
            numericString.append(randomDigit);
        }
        return numericString.toString();
    }

    // Метод для разделения строки на части по первому символу, который не является буквой или цифрой
    public static String[] splitByFirst(String input) {
        String[] result = input.split("(?=[^a-zA-Z0-9])", 2);
        if (result.length == 1) {
            return new String[]{result[0], ""};
        }
        return result;
    }

    // Метод для проверки, состоит ли строка только из цифр
    public static boolean isNumeric(String input) {
        return input.matches("\\d+");
    }
}