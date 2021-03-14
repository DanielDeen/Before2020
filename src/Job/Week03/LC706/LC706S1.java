package Job.Week03.LC706;

import java.util.Arrays;

/**
 * @description: 706.设计哈希映射
 * @author: Daniel Deen
 * @create: 2021-03-14 00:37
 */

public class LC706S1 {
    class MyHashMap {
        private final int SIZE = 1000001;
        int[] arr;

        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            arr = new int[SIZE];
            Arrays.fill(arr, -1);
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            arr[key] = value;
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            return arr[key];
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            arr[key] = -1;
        }
    }
}
