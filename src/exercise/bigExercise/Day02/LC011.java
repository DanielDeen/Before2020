package exercise.bigExercise.Day02;

/**
 * @description: 11. 盛最多水的容器
 * @author: Daniel Deen
 * @create: 2020-11-26 00:25
 */

public class LC011 {
    public int maxArea(int[] height) {
        int maxA = 0;
        for (int i = 0, j = height.length - 1; i < j; i++) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxA = Math.max(maxA, (j - i + 1) * minHeight);
        }

        return maxA;
    }
}
