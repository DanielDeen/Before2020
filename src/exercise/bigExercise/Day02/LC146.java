package exercise.bigExercise.Day02;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @description: 146.LRU缓存机制
 * @author: Daniel Deen
 * @create: 2020-11-26 00:09
 */

public class LC146 extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public LC146(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
