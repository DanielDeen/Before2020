package exercise.week01.LC088;

import java.util.Arrays;

/**
 * @description: 合并有序数组
 * @author: Daniel Deen
 * @create: 2020-10-21 00:41
 */

public class LC088S1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;


        int p1 = m - 1;
        int p2 = n - 1;

        int p = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

//        int[] nums1_copy = new int[m];
//        System.arraycopy(nums1, 0, nums1_copy, 0, m);
//
//        int p1 = 0;
//        int p2 = 0;
//
//        int i = 0;
//        while ((p1 < m) && (p2 < n))
//            nums1[i++] = nums1_copy[p1] <= nums2[p2] ? nums1_copy[p1++] : nums2[p2++];
//
//        if (p1 < m)
//            System.arraycopy(nums1_copy, p1, nums1, p1 + n, m - p1);
//        if (p2 < n)
//            System.arraycopy(nums2, p2, nums1, m + p2, n - p2);

        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        int p = m + n - 1;

        while ((p1 >= 0) && (p2 >= 0)) {
            nums1[p--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2);
    }
}
