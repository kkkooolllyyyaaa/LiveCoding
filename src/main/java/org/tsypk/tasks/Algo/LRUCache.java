package org.tsypk.tasks.Algo;

import java.util.Optional;

public class LRUCache {
    /**
     * Размер кэша N
     */
    public LRUCache(int N) {

    }

    /**
     * Возвращает значение по ключу
     */
    public Optional<Integer> get(int key) {
        // TODO
        return Optional.empty();
    }

    /**
     * Помещаем значение по ключу
     * Если возникает (N+1)-ый ключ, то должен удалиться ключ,
     * который в последний раз использовался раньше всех существующих
     */
    public void put(int key, int value) {

    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns Optional.empty()
        lRUCache.put(4, 4); // evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // returns Optional.empty()
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }
}
