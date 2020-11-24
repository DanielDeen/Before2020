package exercise.bigExercise.Day01;

/**
 * @description: 11.盛最水的容器
 * @author: Daniel Deen
 * @create: 2020-11-25 00:32
 */

public class LC011 {
    public static void main(String[] args) {
        System.out.println(new LC011().maxArea(new int[]{1, 1}));
    }

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (i < j) {
            maxArea = Math.max(maxArea, (j - i) * (Math.min(height[i], height[j])));
            if (height[i] < height[j]) {
                while (i < j && height[++i] <= height[i]) ;
            } else {
                while (i < j && height[--j] <= height[j]) ;
            }
        }

        return maxArea;
    }

    public int maxArea1(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max((j - i + 1) * minHeight, maxArea);
        }

        return maxArea;
    }
}
