package home_task_23_10_23.task_1;

public class Main {
    public static void main(String[] args) {
        NightclubBouncer bouncer = new NightclubBouncer();
        bouncer.addVisitors("Anna", 25);
        bouncer.addVisitors("Amelia", 16);
        bouncer.addVisitors("Nick", 29);
        bouncer.addVisitors("Mark", 15);

        bouncer.removeNextVisitor();
        bouncer.removeNextVisitor();
        bouncer.removeNextVisitor();

    }
}
