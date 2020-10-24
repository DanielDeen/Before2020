package exercise.week01.LC088;

import java.util.Arrays;

/**
 * @description: 合并两个有序数组
 * @author: Daniel Deen
 * @create: 2020-10-21 22:45
 */

public class LC088S2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        int s = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0))
            nums1[s--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
