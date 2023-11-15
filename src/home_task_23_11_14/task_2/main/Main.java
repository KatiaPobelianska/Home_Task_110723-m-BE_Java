package home_task_23_11_14.task_2.main;

import home_task_23_11_14.task_2.book.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", 1951);

        // Получение информации о книге
        System.out.println("Title: " + book.title());
        System.out.println("Author: " + book.author());
        System.out.println("publication year: " + book.publicationYear());
        // Пример вывода с использованием метода toString()
        System.out.println(book);
    }
}
