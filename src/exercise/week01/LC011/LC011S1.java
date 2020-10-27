package exercise.week01.LC011;

import java.util.Map;

/**
 * @description: 盛最多水的容器
 * @author: Daniel Deen
 * @create: 2020-10-25 00:33
 */

public class LC011S1 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int area = 0;

        while (i < j) {
            int tempArea = (j - i) * Math.min(height[i], height[j]);
            if (tempArea > area) {
                area = tempArea;
            }

            if (height[i] < height[j]) {
                i++;
            } else if (height[i] > height[j]) {
                j--;
            } else {
                i++;
                j--;
            }
        }

        return area;
    }
}
