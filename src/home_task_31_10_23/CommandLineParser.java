package home_task_31_10_23;

public class CommandLineParser { private boolean ascending = true;  // По умолчанию сортируем по возрастанию
    private String dataType = null;
    private String outputFileName = null;
    private String[] inputFiles = null;

    public CommandLineParser(String[] args) {
        parseCommandLine(args);
    }

    private void parseCommandLine(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("Недостаточно аргументов командной строки.");
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.equals("-a")) {
                ascending = true;
            } else if (arg.equals("-d")) {
                ascending = false;
            } else if (arg.equals("-s") || arg.equals("-i")) {
                dataType = arg;
            } else if (outputFileName == null) {
                outputFileName = arg;
            } else {
                int numInputFiles = args.length - i;
                inputFiles = new String[numInputFiles];
                System.arraycopy(args, i, inputFiles, 0, numInputFiles);
                break;
            }
        }

        if (dataType == null || outputFileName == null || inputFiles == null) {
            throw new IllegalArgumentException("Неправильный формат аргументов командной строки.");
        }
    }

    public boolean isAscending() {
        return ascending;
    }

    public String getDataType() {
        return dataType;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public String[] getInputFiles() {
        return inputFiles;
    }
}
