package home_task_28_09_23_task_2;

    // Создание класса Student с двумя конструкторами:
public class Student {
    private String firstName;
        private String lastName;
        private int groupNumber;

        // Конструкторы
        public Student(String firstName, String lastName, int groupNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            setGroupNumber(groupNumber); // Используем сеттер для проверки номера группы
        }

        public Student(String firstName, String lastName) {
            this(firstName, lastName, 1); // По умолчанию студент начинает в 1-й группе
        }

        // Геттеры и сеттеры
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

        public int getGroupNumber() {
            return groupNumber;
        }

        public void setGroupNumber(int groupNumber) {
            if (groupNumber <= 0) {
                throw new RuntimeException("Номер группы должен быть положительным");
            }
            this.groupNumber = groupNumber;
        }

        // Метод для перевода в следующую группу
        public void moveToNextGroup() {
            groupNumber++;
        }

        // Клонирующий конструктор
        public Student(Student original) {
            this.firstName = original.firstName;
            this.lastName = original.lastName;
            this.groupNumber = original.groupNumber;
        }
}
