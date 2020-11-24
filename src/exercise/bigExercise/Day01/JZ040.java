package exercise.bigExercise.Day01;

import java.util.Arrays;

/**
 * @description: 最小的K个数
 * @author: Daniel Deen
 * @create: 2020-11-24 23:52
 */

public class JZ040 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new JZ040().getLeastNumbers(new int[]{3, 2, 1}, 2)));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }
}
