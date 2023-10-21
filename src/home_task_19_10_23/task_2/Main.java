package home_task_19_10_23.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Создайте коллекцию (List или Set), добавьте несколько элементов.
// Организовать цикл while по коллекции с помощью итератора.
// Организовать цикл for (не путать с foreach!) по коллекции с помощью итератора
public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // Добавляем элементы в коллекцию
        myList.add("Element 1");
        myList.add("Element 2");
        myList.add("Element 3");
        myList.add("Element 4");
        myList.add("Element 5");
        myList.add("Element 6");

        // Цикл while с использованием итератора
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println("While: " + element);
        }
        // Цикл for с использованием итератора
        iterator = myList.iterator(); // начальное состояние
        for (; iterator.hasNext();) {
            String element = iterator.next();
            System.out.println("For: " + element);
        }

    }
}
