package home_task_05_10_23.task_2;

public class Employee {
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;


    // Конструктор для класса Сотрудник

    public Employee(String firstName, String lastName, int employeeId, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.salary = salary;
    }


    // Геттеры и сеттеры для полей

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
