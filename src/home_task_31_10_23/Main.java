package home_task_31_10_23;

public class Main {
    public static void main(String[] args) {
        try {
            CommandLineParser parser = new CommandLineParser(args);
            boolean ascending = parser.isAscending();
            String dataType = parser.getDataType();
            String outputFileName = parser.getOutputFileName();
            String[] inputFiles = parser.getInputFiles();

            //сортировка данных и запись в файл outputFileName
            //dataType для определения типа данных (строки или целые числа)
            //ascending для определения порядка сортировки (по возрастанию или убыванию)

            // Пример обработки и вывода полученных данных:
            System.out.println("Сортировка: " + (ascending ? "по возрастанию" : "по убыванию"));
            System.out.println("Тип данных: " + dataType);
            System.out.println("Имя выходного файла: " + outputFileName);
            System.out.println("Входные файлы:");
            for (String inputFile : inputFiles) {
                System.out.println(inputFile);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
