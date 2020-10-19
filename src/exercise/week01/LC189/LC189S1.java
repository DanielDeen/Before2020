package exercise.week01.LC189;

import java.util.Arrays;

/**
 * @description: 旋转数组
 * @author: Daniel Deen
 * @create: 2020-10-20 00:34
 */

public class LC189S1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }

//    public static void rotate(int[] nums, int k) {
//        if (nums.length == 0) {
//            return;
//        }
//        int step = k % nums.length;;
//        int count = 0;
//        for (int start = 0; count < nums.length; start++) {
//            int current = start;
//            int pre = nums[start];
//            do {
//                int next = (current + step) % nums.length;
//                int temp = nums[next];
//                current = next;
//                nums[next] = pre;
//                pre = temp;
//                count++;
//            } while (start != current);
//        }
//    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

}
