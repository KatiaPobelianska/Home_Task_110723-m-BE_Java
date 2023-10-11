package home_task_05_10_23.task_2;

public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee employee1 = new Employee("Иван", "Иванов", 2, 50000);
        Employee employee2 = new Employee("Петр", "Петров", 5, 60000);
        Employee employee3 = new Employee("Ира", "Петрова", 15, 67000);
        Employee employee4 = new Employee("Оксана", "Серая", 56, 60500);


        // Создаем директоров
        Director director1 = new Director("Анна", "Сидорова", 8, 100000,  true);
        Director director2 = new Director("Виктор", "Сидоров", 108, 120000,  true);

        // Создаем департаменты и добавляем сотрудников
        Department department1 = new Department("Отдел продаж");
        Department department2 = new Department("Отдел разработки");

        // Устанавливаем связи между объектами
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department1.setDirector(director1);

        department2.addEmployee(employee3);
        department2.addEmployee(employee4);
        department2.setDirector(director2);

        // Создаем организацию
        Organization organizationName = new Organization("Моя организация");


        // Добавляем департаменты в организацию
        organizationName.addDepartment(department1);
        organizationName.addDepartment(department2);

//        =================
        // Выводим информацию о созданных объектах
        System.out.println("Организация: " + organizationName.getOrganizationName());
        for (Department department : organizationName.getDepartments()) {
            System.out.println("Департамент: " + department.getName());
        }

        System.out.println("Сотрудники в департаменте: ");
        for (Employee employee: department2.getEmployees()){
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " (ID: " + employee.getEmployeeId() + ") " + employee.getSalary());
        }
        for (Employee employee: department1.getEmployees()){
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " (ID: " + employee.getEmployeeId() + ") " + employee.getSalary());
        }
        Director director = department1.getDirector();
        if (director != null) {
            System.out.println("Директор департамента: " + director.getFirstName() + " " + director.getLastName() + " (ID: " + director.getEmployeeId() + ") " + director.getSalary());
        }

        System.out.println();
//        ==================== НЕПОНЯТНО, ПОЧЕМУ 2 ДИРЕКТОРА НЕ ВЫВОДИТЬСЯ???? ===>>> ДАЙТЕ, ПОЖАЛУЙСТА, КОММЕНТАРИЙ
//        Director director2 = department2.getDirector();

    }
}
//================ ОТВЕТЫ НА ВОПРОСЫ: =================

//Между указанными классами будут существовать следующие виды отношений:
//
//Наследование:
//
//Класс Директор (Director) наследует от класса Сотрудник (Employee).
// Это отношение наследования позволяет классу Директор наследовать поля и методы класса Сотрудник,
// а также добавлять свои собственные поля и методы.

//Агрегация:
//
//Класс Департамент (Department) имеет агрегацию к классу Сотрудник (Employee),
// потому что департамент содержит в себе список сотрудников (employees).
// Департамент и сотрудники могут существовать независимо друг от друга, и сотрудники могут быть частью разных департаментов.

//Композиция:
//
//Класс Организация (Organization) также имеет агрегацию к классу Департамент (Department),
// так как организация содержит в себе список департаментов. Однако это также может рассматриваться как композиция,
// потому что департаменты могут существовать только в рамках организации и не могут существовать независимо от нее.
// Если организация уничтожается, то и департаменты также перестают существовать.
//Таким образом, отношения между классами включают в себя наследование, агрегацию и, в некоторых случаях, композицию,
// в зависимости от семантики данных классов и их взаимосвязей.