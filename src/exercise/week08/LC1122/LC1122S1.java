package exercise.week08.LC1122;

/**
 * @description: 1122.数组的相对排序
 * @author: Daniel Deen
 * @create: 2020-12-12 23:02
 */

public class LC1122S1 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] temp = new int[1001];
        for (int arr : arr1) {
            temp[arr]++;
        }
        int[] res = new int[arr1.length];
        int index = 0;
        for (int arr : arr2) {
            while (temp[arr] > 0) {
                res[index++] = arr;
                temp[arr]--;
            }
        }
        for (int i = 0; i < 1001; i++) {
            while (temp[i] > 0) {
                res[index++] = i;
                temp[i]--;
            }
        }
        return res;
    }
}
