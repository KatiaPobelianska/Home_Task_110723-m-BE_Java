package home_task_05_10_23.task_2;

public class Director extends Employee {

    private boolean specialStatus;

    // Конструктор
    public Director(String firstName, String lastName, int employeeId, double salary, boolean specialStatus) {
        super(firstName, lastName, employeeId, salary);
        this.specialStatus = specialStatus;
    }
    // Геттеры и сеттеры для поля

    public boolean isSpecialStatus() {
        return specialStatus;
    }

    public void setSpecialStatus(boolean specialStatus) {
        this.specialStatus = specialStatus;
    }
}
