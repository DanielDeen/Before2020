package exercise.week13.LC277;

/**
 * @description: 277.搜索名人
 * @author: Daniel Deen
 * @create: 2021-01-15 01:45
 */

public class LC277S2 {
    public int findCelebrity(int n) {
        int candidate = 0;
        for (int i = 0; i < n; i++) {
            if (knows(candidate, i)) candidate = i;
        }

        for (int i = 0; i < n; i++) {
            if (candidate == i) continue;
            if (knows(candidate, i) || !knows(i, candidate)) return -1;
        }

        return candidate;
    }

    public boolean knows(int a, int b) {
        return true;
    }
}
