package home_task_26_10_23.task_3;

public class Student <T extends Subject>{
    private String name;
    private T subject;

    public Student(String name, T subject){
        this.name = name;
        this.subject = subject;
    }
    public String getName(){
        return name;
    }
    public T getSubject(){
        return subject;
    }

}
