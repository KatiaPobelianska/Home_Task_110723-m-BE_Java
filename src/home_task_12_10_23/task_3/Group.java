package home_task_12_10_23.task_3;

import java.util.ArrayList;
import java.util.List;

//Создайте класс Group, который хранит фамилии всех студентов в учебной группе.
// В классе напишите метод, который по заданным первым буквам фамилии находит всех студентов
// и возвращает результат в виде списка. Вызовите метод в main.
public class Group {
    private List<String> students = new ArrayList<>();

    public Group() {
        // Здесь можно добавить начальный список студентов
        students.add("Smith");
        students.add("Schiller");
        students.add("Grey");
        students.add("White");
        students.add("Muller");
    }

    public List<String> findStudentsByTheFirstLetter(String firstLetter) {
        List<String> result = new ArrayList<>();
        firstLetter = firstLetter.toUpperCase();  // Приводим к верхнему регистру

        for (String student : students){
            if (student.startsWith(firstLetter)){
                result.add(student);
            }
        }
        return result;
    }
}
