package home_task_05_10_23.task_2;


import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String organizationName;
    private List<Department> departments;

    // Конструктор

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        this.departments = new ArrayList<>();

    }

    // Геттеры и сеттеры для полей

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }


    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
    // Метод для добавления департамента в организацию
    public void addDepartment(Department department){
        departments.add(department);
    }
}
