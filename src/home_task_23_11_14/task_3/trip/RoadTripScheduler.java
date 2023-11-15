package home_task_23_11_14.task_3.trip;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*Пользователь планирует поездку из Берлина в Стамбул на автомобиле.
Выберите несколько точек на маршруте и прикиньте длительность путешествия между этими точками.
 Пользователь вводит дату и время своего отправления. Программа должна вывести расписание (дату и время),
 когда пользователь должен прибыть в указанные пункты.*/
public class RoadTripScheduler {
    public static void main(String[] args) {
        // Ввод данных от пользователя
        LocalDateTime departureDateTime = getUserInputDateTime("Введите дату и время отправления (гггг-мм-дд чч:мм): ");

        // Точки на маршруте
        String[] cities = {"Берлин", "Прага", "Вена", "Будапешт", "Белград", "Стамбул"};

        // Прикидываем длительность путешествия между точками (в часах)
        int[] travelDurations = {5, 3, 2, 5, 4, 3};  // Пример длительности между городами (в часах)

        // Рассчитываем прибытие в каждую точку
        LocalDateTime arrivalDateTime = departureDateTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Расписание поездки:");

        for (int i = 0; i < cities.length; i++) {
            // Рассчитываем прибытие в следующий город
            arrivalDateTime = arrivalDateTime.plusHours(travelDurations[i]);

            // Выводим расписание
            System.out.println(cities[i] + ": " + formatter.format(arrivalDateTime));
        }
    }

    // Метод для получения ввода даты и времени от пользователя с использованием Scanner
    private static LocalDateTime getUserInputDateTime(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        // Парсим строку в LocalDateTime
        return LocalDateTime.parse(userInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}