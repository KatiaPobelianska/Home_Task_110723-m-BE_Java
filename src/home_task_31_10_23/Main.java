package home_task_31_10_23;
//1 Напишите класс CommandLineParser. Парсер должен принять аргументы командной строки, переданных в
//программу и превратить их в экземпляр класса настройки некой сортировки по следующим правилам:
//a. режим сортировки (-a или -d), необязательный, по умолчанию сортируем по возрастанию;
//b. тип данных (-s или -i), обязательный;
//c. имя выходного файла, обязательное;
//d. остальные параметры – имена входных файлов, не менее одного.
//Примеры запуска из командной строки для Windows:
//sort-it.exe -i -a out.txt in.txt (для целых чисел по возрастанию) sort-it.exe -s out.txt in1.txt in2.txt in3.txt (для
//строк по возрастанию) sort-it.exe -d -s out.txt in1.txt in2.txt (для строк по убыванию)
//2 Если переданы неправильные данные, то парсер должен выбросить собственное checked-исключение.
//3 В основной программе создайте экземпляр парсера и передайте ему аргументы командной строки
//запуска программы. Обработайте необходимые исключения.
//4 Сохраните программу – в будущем она нам ещё пригодится.
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
