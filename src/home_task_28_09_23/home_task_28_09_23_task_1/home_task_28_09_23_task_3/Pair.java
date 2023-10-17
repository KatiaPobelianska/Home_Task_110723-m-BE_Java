package home_task_28_09_23.home_task_28_09_23_task_1.home_task_28_09_23_task_3;

public class Pair {
    private String first;
    private String second;

    // Блок инициализации
    {
        System.out.println("Инициализация: first = " + first + ", second = " + second);
        first = "one";
        second = "two";
    }
    // Конструктор по умолчанию
    public Pair() {
        System.out.println("Конструктор по умолчанию: first = " + first + ", second = " + second);
    }
    // Конструктор с параметрами
    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
        System.out.println("Конструктор с параметрами: first = " + first + ", second = " + second);
    }

    // Геттеры
    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }
}
