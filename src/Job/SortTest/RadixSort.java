package Job.SortTest;

import java.util.Arrays;

/**
 * @description: 基数排序
 * @author: Daniel Deen
 * @create: 2021-03-07 14:16
 */

public class RadixSort {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 3, 3, 2, 1, 1};
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        radixSort(nums);
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
    }


    public static void radixSort(int[] nums) {

    }
}
