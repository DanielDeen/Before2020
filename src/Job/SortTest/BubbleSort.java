package Job.SortTest;

import java.util.Arrays;

/**
 * @description: 冒泡排序
 * @author: Daniel Deen
 * @create: 2021-03-07 14:03
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 3, 3, 2, 1, 1};
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        bubbleSort(nums);
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
    }


    public static void bubbleSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
