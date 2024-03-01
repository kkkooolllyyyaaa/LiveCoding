package org.tsypk.tasks.productionCode.MetricHolder;

import java.time.Duration;

/**
 * Представь, что нам нужно уметь считать метрику типа "counter"
 * Мы за какой-то период можем рассчитать, какая сумма значений была записана
 * Нужно реализовать класс собирателя метрик, а именно два метода
 */
public class MetricHolder {
    /**
     * Прибавляем amount к текущему значению метрики
     */
    public void incrementMetric(int amount) {
        throw new UnsupportedOperationException();
    }

    /**
     * Возвращает сумму метрики за period
     * [now - period ; now]
     */
    public int collectMetric(Duration period) {
        throw new UnsupportedOperationException();
    }
}

// В ArrayList добавляем в конец {Instant.now(), amount}. Все записи incrementMetric будут идти по возрастанию Instant'а.
// При collectMetric с помощью бинарного поиска находим левую границу интервала – [now - period]. Далее можем просуммировать значения amount с левой границы до конца.

// Можно лучше использую префиксную сумму. Будем добавлять в список не просто amount, а сумму всех предыдущих amount и текущий amount, тогда найдя левую границу мы можем найти разницу сумм: int answer = last.sum - left.sum;