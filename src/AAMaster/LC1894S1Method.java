package AAMaster;

/**
 * @program Before2020
 * @description: 1894.找到需要补充粉笔的学生编号
 * @author: ding
 * @create: 2021/09/11 00:06
 */
public class LC1894S1Method {
	public int chalkReplacer(int[] chalk, int k) {
		if (chalk[0] > k) {
			return 0;
		}
		int n = chalk.length;
		for (int i = 1; i < n; i++) {
			chalk[i] += chalk[i - 1];
			if (chalk[i] > k) {
				return i;
			}
		}
		k %= chalk[n - 1];
		return binarySearch(chalk, k);
	}


	public int binarySearch(int[] arr, int target) {
		int low = 0, high = arr.length - 1;
		while (low < high) {
			int mid = low + (high - low) >> 1;
			if (arr[mid] <= target) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}
}
