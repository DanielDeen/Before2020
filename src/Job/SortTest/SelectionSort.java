package Job.SortTest;

import java.util.Arrays;

/**
 * @description: 选择排序
 * @author: Daniel Deen
 * @create: 2021-03-07 14:25
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 3, 3, 2, 1, 1};
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        selectionSort(nums);
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
    }

    public static void selectionSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    index = j;
                }
            }
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}
