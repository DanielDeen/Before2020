package Micro.caprice.array.BBinarySearch;

/**
 * @program Before2020
 * @description: 69. x 的平方根
 * @author: ding
 * @create: 2022/02/22 23:37
 */
public class MySqrt {
	public static void main(String[] args) {
		System.out.println(new MySqrt().mySqrt(2147395599));
	}

	public int mySqrt(int x) {
		int ans = -1;

		int left = 0;
		int right = x;
		while (left <= right) {
			int mid = left + ((right - left) >> 1);
			// 注意 mid*mid 的范围，所以转换为 long 类型进行比较
			if ((long)mid * mid <= x) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}
}
