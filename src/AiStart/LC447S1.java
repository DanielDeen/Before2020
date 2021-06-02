package AiStart;

/**
 * @program Before2020
 * @description: 477.汉明距离的总和
 * @author: ding
 * @create: 2021/05/28 22:33
 */
public class LC447S1 {
	public int totalHammingDistance(int[] nums) {
		int n = nums.length;
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			int c = 0;
			for (int val : nums) {
				c += (val >> i) & 1;
			}
			sum += c * (n - c);
		}
		return sum;
	}

	int getHanmingDistance(int x, int y) {
		int sum = x ^ y;
		int res = 0;
		while (sum > 0) {
			res += sum & 1;
			sum = sum >> 1;
		}
		return res;
	}
}
