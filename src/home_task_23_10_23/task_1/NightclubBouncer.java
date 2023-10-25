package home_task_23_10_23.task_1;
//Создайте программу Вышибала, которая обслуживает посетителей в порядке их прихода
// в ночной клуб.
// Если посетителю меньше 21 года, то в клуб его не пустят.
import java.util.LinkedList;
import java.util.Queue;

public class NightclubBouncer {
    private Queue<String> visitors = new LinkedList<>();

    public void addVisitors(String name, int age){
        if (age >= 21){visitors.add(name);
        System.out.println(name + " Допущен(-а) в клуб");
        } else {
            System.out.println(name + " НЕ допущен(-а) в клуб из-за возраста");
        }
    }
    public void removeNextVisitor(){
        if (!visitors.isEmpty()){
            String nextVisitor = visitors.poll();
            System.out.println(nextVisitor + " покинул(-а) клуб");
        } else {
            System.out.println(" Клуб пуст");
        }
    }
}
