package LookOffer.day08;

/**
 * @program Before2020
 * @description: 剑指 Offer 10- I. 斐波那契数列
 * @author: ding
 * @create: 2021/12/30 23:31
 */
public class Fib {
	public int fib(int n) {
		int a = 0, b = 1, sum;
		for (int i = 0; i < n; i++) {
			sum = (a + b) % 1000000007;
			a = b;
			b = sum;
		}
		return a;
	}

}
