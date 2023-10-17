package home_task_28_09_23.home_task_28_09_23_task_1.home_task_28_09_23_task_2;

public class MainStudent {
    public static void main(String[] args) {
        // Создаем объект студента
        Student student1 = new Student("Иван", "Иванов", 1);

        System.out.println("Исходная группа: " + student1.getGroupNumber());

        student1.moveToNextGroup();
        System.out.println("Новая группа: " + student1.getGroupNumber());

        // Клонируем объект студента
        Student student2 = new Student(student1);

        // Проверяем, что объекты имеют разные ссылки в памяти
        System.out.println("student1 == student2: " + (student1 == student2));

        // Изменяем одно из полей оригинального студента
        student1.setFirstName("Петр");

        // Проверяем, изменилось ли то же поле у клона
        System.out.println("Имя student1: " + student1.getFirstName());
        System.out.println("Имя student2: " + student2.getFirstName());
    }
}