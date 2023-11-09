package home_task_02_11_23.task_1;

import java.util.Random;
/**
 * Класс, представляющий велосипед.
 */
public class Bicycle {
    /**
     * Бренд велосипеда.
     */
    private String brand;

    /**
     * Массив с двумя колесами велосипеда.
     */
    private Wheel[] wheels = new Wheel[2];

    /**
     * Массив частей велосипеда.
     */
    private Part[] parts;

    /**
     * Конструктор для создания велосипеда с указанным брендом.
     *
     * @param brand Бренд велосипеда.
     */
    public Bicycle(String brand) {
        this.brand = brand;
        wheels[0] = new Wheel(4);
        wheels[1] = new Wheel(4);
        parts = new Part[]{
        new Handlebar(5),
                new Saddle(1),
                new Gears(19),
                new Frame(10)
        };
    }

    /**
     * Проверить, сломан ли велосипед.
     *
     * @return true, если велосипед сломан, в противном случае - false.
     */
    public boolean isBroken(){
        for(Part part: parts){
            if (part.isBroken()) return true;
        }
        return false;
    }

    public void move(){
        if (!isBroken()){
            System.out.println("Велосипед продолжает движение.");
        } else {
            System.out.println("Велосипед сломан.");
        }
    }

    /**
     * Встретить препятствие и обработать его воздействие на часть велосипеда.
     *
     * @param obstacle Препятствие, которое велосипед встречает на пути.
     */
    public void encounterObstacle(Obstacle obstacle){
        if (!isBroken()){
            Random random = new Random();
            int partIndex = random.nextInt(parts.length);
            Part part = parts[partIndex];
            part.breakPart(obstacle);
        }
    }

    /**
     * Внутренний класс, представляющий руль велосипеда.
     */
    private class Handlebar extends Part {

        /**
         * Конструктор для создания руля велосипеда с указанным запасом прочности.
         *
         * @param strength Запас прочности руля.
         */
        public Handlebar(int strength) {
            super(strength);
        }
    }

    /**
     * Внутренний класс, представляющий седло велосипеда.
     */
    private class Saddle extends Part {

        /**
         * Конструктор для создания седла велосипеда с указанным запасом прочности.
         *
         * @param strength Запас прочности седла.
         */
        public Saddle(int strength) {
            super(strength);
        }
    }

    /**
     * Внутренний класс, представляющий колесо велосипеда.
     */
    private class Wheel extends Part {

        /**
         * Конструктор для создания колеса велосипеда с указанным запасом прочности.
         *
         * @param strength Запас прочности колеса.
         */
        public Wheel(int strength) {
            super(strength);
        }
    }

    /**
     * Внутренний класс, представляющий передачи велосипеда.
     */
    private class Gears extends Part {

        /**
         * Конструктор для создания передач велосипеда с указанным запасом прочности.
         *
         * @param strength Запас прочности передач.
         */
        public Gears(int strength) {
            super(strength);
        }
    }

    /**
     * Внутренний класс, представляющий раму велосипеда.
     */
    private class Frame extends Part {

        /**
         * Конструктор для создания рамы велосипеда с указанным запасом прочности.
         *
         * @param strength Запас прочности рамы.
         */
        public Frame(int strength) {
            super(strength);
        }
    }
}
