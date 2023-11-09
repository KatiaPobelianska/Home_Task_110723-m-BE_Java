package home_task_02_11_23.task_1;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("MyBrand");
        Obstacle randomObstacle = new RandomObstacle();

        while (!bicycle.isBroken()){
            bicycle.move();
            bicycle.encounterObstacle(randomObstacle);
            bicycle.move();
        }
    }
}
