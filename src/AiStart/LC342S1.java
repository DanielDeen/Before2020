package AiStart;

/**
 * @program Before2020
 * @description: 342.4的幂
 * @author: ding
 * @create: 2021/05/31 23:00
 */
public class LC342S1 {
	public boolean isPowerOfFour(int n) {
		if (n < 1) {
			return false;
		}
		int sum = 0;
		while (n > 1) {
			if ((n & 1) == 1) {
				return false;
			}
			sum++;
			n >>= 1;
		}
		return sum % 2 == 0;
	}
}
