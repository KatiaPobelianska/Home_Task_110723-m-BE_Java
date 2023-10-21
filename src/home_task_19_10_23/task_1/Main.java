package home_task_19_10_23.task_1;

import java.util.Comparator;
import java.util.TreeSet;

//Создайте TreeSet с экземплярами этого класса. При создании TreeSet передайте в него компаратор,
// который сравнивает экземпляры по полю firstName. Выведите множество в консоль.
public class Main {
    public static void main(String[] args) {
        // Создаем TreeSet с компаратором, сравнивающим по полю firstName
        TreeSet<FullName> fullNames = new TreeSet<>(new Comparator<FullName>() {
            @Override
            public int compare(FullName name1, FullName name2) {
                return name1.getFirstname().compareTo(name2.getFirstname());
            }
        });
        // Добавляем экземпляры FullName в TreeSet
        fullNames.add(new FullName("Kiwi", "Doe"));
        fullNames.add(new FullName("Bob", "Marley"));
        fullNames.add(new FullName("Eva", "Braun"));
        fullNames.add(new FullName("Jessica", "Parker"));
        fullNames.add(new FullName("Nils", "Grey"));
        fullNames.add(new FullName("Mark", "Smith"));
        // Выводим множество в консоль
        for (FullName name : fullNames) {
            System.out.println(name);
        }
    }
}
