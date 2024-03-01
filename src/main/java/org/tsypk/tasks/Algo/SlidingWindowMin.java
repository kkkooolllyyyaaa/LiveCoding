package org.tsypk.tasks.Algo;

/**
 * Класс, используемый для подсчёта наименьшего значения в окне размером W.
 */
public class SlidingWindowMin {
    public SlidingWindowMin(int W) {
    }

    /**
     * Добавляет новое значение в окно.
     * В случае, если размер окна превышает W, удаляет значение из начала окна.
     */
    public void add(int value) {
        // TODO
        return;
    }

    /**
     * Возвращает наименьшее значение в окне.
     */
    public int getMin() {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        SlidingWindowMin window = new SlidingWindowMin(3);
        for (int i = 0; i < 5; i++) {
            window.add(i);
            System.out.printf("curValue = %d , minValue = %d\n", i, window.getMin());
            // curValue =  0 , minValue =  0
            // curValue =  1 , minValue =  0
            // curValue =  2 , minValue =  0
            // curValue =  3 , minValue =  1
            // curValue =  4 , minValue =  2
            // curValue =  5 , minValue =  3
        }
    }
}