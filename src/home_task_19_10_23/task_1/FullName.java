package home_task_19_10_23.task_1;
//Создайте класс FullName полного имени человека (firstName, lastName).

public class FullName {
    private String firstname;
    private String lastname;

    public FullName(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
//        return "FullName{" +
//                "firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                '}';
        return firstname + " " + lastname;
    }
}
