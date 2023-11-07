package home_task_02_11_23;

import home_task_02_11_23.task_2.Bicycle;

// Отгадайте загадку: с крыльями, но не летает,
// с цепью, но не лает, со спицами, но не вяжет, с седлом,
// но не скачет, с рамой, но не дует.
public class Main {
    public static void main(String[] args) {
//        String o = "bike";
//        System.out.println("Ответ на загадку: " + o);
        Bicycle myBike = new Bicycle("MyBrand");

//        handlebar.breakHandlebar();
//        saddle.breakSaddle();
//        frame.breakFrame();
//        gears.breakGears();
//        wheel.breakWheel();

        while (!myBike.isBroken()){
            myBike.move();
            myBike.encounterObstacle();
        }
    }
}
