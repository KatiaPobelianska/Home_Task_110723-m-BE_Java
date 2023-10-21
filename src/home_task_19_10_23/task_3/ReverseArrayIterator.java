package home_task_19_10_23.task_3;
import java.util.Iterator;

public class ReverseArrayIterator implements Iterator<Integer> {
    private int[] array;
    private int currentIndex;

    public ReverseArrayIterator(int[] array) {
        this.array = array;
        this.currentIndex = array.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return array[currentIndex--];
        } else {
            throw new java.util.NoSuchElementException();
        }
    }
}