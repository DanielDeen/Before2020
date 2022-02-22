package Micro.caprice.array.BBinarySearch;

/**
 * @program Before2020
 * @description: 367. 有效的完全平方数
 * @author: ding
 * @create: 2022/02/23 00:01
 */
public class PerfectSquare {
	public static void main(String[] args) {
		System.out.println(new PerfectSquare().isPerfectSquare(5));
	}

	public boolean isPerfectSquare(int num) {
		if (num == 0 || num == 1) {
			return true;
		}
		int left = 0;
		int right = num;
		while (left <= right) {
			int mid = left + ((right - left) >> 1);
			if (mid == (num / mid) && (num % mid == 0)) {
				return true;
			}
			if (mid > num / mid) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return false;
	}
}
