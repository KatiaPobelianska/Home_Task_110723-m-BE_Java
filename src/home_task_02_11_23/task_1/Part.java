package home_task_02_11_23.task_1;

import java.util.Random;
/**
 * Абстрактный класс, представляющий часть велосипеда с запасом прочности.
 */
public abstract class Part {
    private int strength;

    /**
     * Конструктор для создания части велосипеда с указанным запасом прочности.
     *
     * @param strength Запас прочности части велосипеда.
     */
    public Part(int strength) {
        this.strength = strength;
    }

    /**
     * Получить текущий запас прочности части велосипеда.
     *
     * @return Запас прочности части велосипеда.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Проверить, сломана ли часть велосипеда.
     */
    public boolean isBroken() {
        return strength <= 0;
    }

    /**
     * Уменьшить запас прочности части велосипеда в результате воздействия препятствия.
     *
     * @param obstacle Препятствие, которое воздействует на часть велосипеда.
     */
    public void breakPart(Obstacle obstacle) {
        if (strength > 0) {
            int damage = new Random().nextInt(5) + 1;
            strength -= damage;
            System.out.println(obstacle.getDescription() +" повредил(-a/-o) часть велосипеда. Запас прочности: " + strength);
            if (strength <= 0) {
                System.out.println(this.getClass().getSimpleName() + " - полностью сломаная часть велосипеда.");
            }
        }
    }


}
