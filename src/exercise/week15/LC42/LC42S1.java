package exercise.week15.LC42;

/**
 * @description: 42.接雨水
 * @author: Daniel Deen
 * @create: 2021-01-28 01:39
 */

public class LC42S1 {
    public int trap(int[] height) {
        int res = 0;
        int size = height.length;
        for (int i = 1; i < size-1; i++) {
            int maxLeft = 0, maxRight = 0;
            for (int j = i; j >= 0 ; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < size; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            res += Math.min(maxLeft, maxRight) - height[i];
        }
        return res;
    }

    public int trap2(int[] height) {
        int left = 0, right = height.length -1;
        int ans = 0;
        int leftMax = 0, rightMax = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += (leftMax - height[left]);
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans +=(rightMax - height[right]);
                }
                right--;
            }
        }
        return ans;
    }
}
