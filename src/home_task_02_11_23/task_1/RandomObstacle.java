package home_task_02_11_23.task_1;

import java.util.Random;
/**
 * Класс, представляющий случайное препятствие для велосипеда.
 */
public class RandomObstacle implements Obstacle {
    /**
     * Массив описаний различных препятствий.
     */
    private static final String[] obstacleDescription = {
            "Яма",
            "Бордюр",
            "Битое стекло",
            "Лужа",
            "Препядствие"
    };

    /**
     * Получить случайное описание препятствия из массива описаний.
     *
     * @return Описание случайного препятствия.
     */
    @Override
    public String getDescription() {
        Random random = new Random();
        int index = random.nextInt(obstacleDescription.length);
        return obstacleDescription[index];
    }

}
