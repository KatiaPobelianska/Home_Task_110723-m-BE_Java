package home_task_10_10_23.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month: ");

        String userInput = scan.nextLine().toLowerCase();
        Month month = Month.findMonth(userInput);

        if (month != null){
            int advTemperature = month.getAvgTemperature();
            String season = month.getSeason();

            System.out.println("Average temperature: " + advTemperature + "°C");
            System.out.println("Season: " + season);
        } else {
            System.out.println("Месяц не найден. Пожалуйста, введите правильное название месяца");
        }

    }
}
