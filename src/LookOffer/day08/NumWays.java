package LookOffer.day08;

/**
 * @program Before2020
 * @description: 剑指 Offer 10- II. 青蛙跳台阶问题
 * @author: ding
 * @create: 2021/12/30 23:32
 */
public class NumWays {
	public int numWays(int n) {
		int a = 1, b = 1, sum;
		for (int i = 0; i < n; i++) {
			sum = (a + b) % 1000000007;
			a = b;
			b = sum;
		}
		return a;
	}
}
