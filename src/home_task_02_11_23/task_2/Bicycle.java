package home_task_02_11_23.task_2;

import java.util.Random;

/*Создайте класс Велосипед. Типы полей этого класса должны
быть объявлены как внутренние классы (руль, седло, колесо, передачи, рама и т.д.).
 Каждая часть велосипеда помимо описания характеристик хранит запас прочности.
Когда запас прочности равен 0, часть велосипеда ломается.*/
public class Bicycle {
    private String brand;

    private Handlebar handlebar;
    private Saddle saddle;
    private Wheel wheel;
    private Gears gears;
    private Frame frame;

    public Bicycle(String brand) {
        this.brand = brand;
        handlebar = new Handlebar(5);
        saddle = new Saddle(1);
        wheel = new Wheel(4);
        gears = new Gears(19);
        frame = new Frame(10);
    }
    /**
     * Внутренний класс для руля
     */
    public class Handlebar {
        private int strength;

        public Handlebar(int strength) {
            this.strength = strength;
        }

        public void breakHandlebar() {
            if (strength > 0) {
                strength--;
                System.out.println("Руль сломан. Запас прочности руля: " + strength);
            } else {
                System.out.println("Руль полностью сломан.");
            }
        }
    }
    /**
     * Внутренний класс для седла
     */
    public class Saddle {
        private int strength;

        public Saddle(int strength) {
            this.strength = strength;
        }

        public void breakSaddle() {
            if (strength > 0) {
                strength--;
                System.out.println("Седло сломано. Запас прочности седла: " + strength);
            } else {
                System.out.println("Седло польностью сломано.");
            }
        }
    }
    /**
     * Внутренний класс для колеса
     */
    public class Wheel {
        private int strength;

        public Wheel(int strength) {
            this.strength = strength;
        }
        public void breakWheel() {
            if (strength > 0) {
                strength--;
                System.out.println("Колесо сломано. Запас прочности колеса: " + strength);
            } else {
                System.out.println("Колесо полностью сломано.");
            }
        }
    }
    /**
     * Внутренний класс для передач
     */
    public class Gears {
        private int strength;

        public Gears(int strength) {
            this.strength = strength;
        }
        public void breakGears() {
            if (strength > 0) {
                strength--;
                System.out.println("Передачи сломаны. Запас прочности передач: " + strength);
            } else {
                System.out.println("Передачи полностью сломаны.");
            }
        }
    }
    /**
     * Внутренний класс для рамы
     */
    public class Frame {
        private int strength;

        public Frame(int strength) {
            this.strength = strength;
        }

        public void breakFrame() {
            if (strength > 0) {
                strength--;
                System.out.println("Рама сломана. Запас прочности рамы: " + strength);
            } else {
                System.out.println("Рама полностью сломана.");
            }
        }
    }

    /*В основной программе создайте велосипед. Велосипед должен ехать и
    встречать на пути препятствия (яма, бордюр, битое стекло, лужа и т.д.).
    Каждое препятствие уменьшает показатель прочности на случайную величину у случайной части велосипеда.
     Программа выполняется, пока у велосипеда нет сломанных частей*/
    private boolean isBroken = false;
    /**
     * Метод метод isBroken возвращает значение поля isBroken,
     * которое указывает на то, сломан ли велосипед.
     */
    public boolean isBroken() {
        return isBroken;
    }
    /**
     * Метод для движения велосипеда. Если велосипед сломан, выводит сообщение об этом.
     */
    public void move() {
        if (!isBroken) {
            System.out.println("Велосипед движется.");
        } else {
            System.out.println("Велосипед сломан и не может двигаться.");
        }
    }

    public void encounterObstacle() {
        if (!isBroken) {
            Random random = new Random();
            int obstacle = random.nextInt(5);

            switch (obstacle) {
                case 0:
                    handlebar.breakHandlebar();
                    break;
                case 1:
                    saddle.breakSaddle();
                    break;
                case 2:
                    wheel.breakWheel();
                    break;
                case 3:
                    gears.breakGears();
                    break;
                case 4:
                    frame.breakFrame();
                    break;
                default:
                    System.out.println("Неожиданное препятствие: " + obstacle);
            }
            if (handlebar.strength <= 0 || saddle.strength <= 0 || wheel.strength <= 0 || gears.strength <= 0 || frame.strength <= 0) {
                isBroken = true;
                System.out.println("Велосипед сломан.");
            }
        }
    }

}
