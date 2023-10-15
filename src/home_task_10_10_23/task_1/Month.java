package home_task_10_10_23.task_1;

// Перечисление Month
enum Month {
    JANUARY( 0, "Winter"),
    FEBRUARY( -2, "Winter"),
    MACH( 5, "Spring"),
    APRIL( 9, "Spring"),
    MAI( 5, "Spring"),
    JUNE( 22, "Summer"),
    JULY( 15, "Summer"),
    AUGUST( 20, "Summer"),
    SEPTEMBER( 5, "Autumn"),
    OCTOBER( 9, "Autumn"),
    NOVEMBER( 10, "Autumn"),
    DECEMBER( 0, "Winter");

    private final int avgTemperature;
    private final String season;


    Month(int avgTemperature, String season) {
        this.avgTemperature = avgTemperature;
        this.season = season;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

    public String getSeason() {
        return season;
    }

    public static Month findMonth(String nameMonth){
        for (Month month: values()){
            if (month.name().toLowerCase().startsWith(nameMonth)){
                return month;
            }
        }
        return null;
    }
}







