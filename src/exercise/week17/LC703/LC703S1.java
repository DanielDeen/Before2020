package exercise.week17.LC703;

import java.util.PriorityQueue;

/**
 * @description: 703.数据流中的第 K 大元素
 * @author: Daniel Deen
 * @create: 2021-02-11 23:45
 */

public class LC703S1 {
    PriorityQueue<Integer> pq;
    int k;

    public LC703S1(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for (int x : nums) {
            add(x);
        }
    }

    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
