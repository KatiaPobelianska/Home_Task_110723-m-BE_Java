package home_task_05_10_23.task_2;


import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees;
    private Director director;

    // Конструктор

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Геттеры и сеттеры для полей

    public String getName() {
        return departmentName;
    }

    public void setName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    // Метод для добавления сотрудника в департамент
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}