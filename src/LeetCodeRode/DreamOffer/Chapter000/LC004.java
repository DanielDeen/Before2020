package LeetCodeRode.DreamOffer.Chapter000;

import java.util.Arrays;

/**
 * @description: 合并两个有序数组: 两个有序数组 nums1 和 nums2， 将nums2 合并到 nums1 使num1成为一个有序数组
 * @author: Daniel Deen
 * @create: 2020-09-18 23:36
 */

public class LC004 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3, 0,0 ,0};
        int[] nums2 = {2,5,6};

        System.arraycopy(nums2, 0, nums1, 3, 3);

        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
