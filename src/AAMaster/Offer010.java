package AAMaster;

/**
 * @program Before2020
 * @description: 剑指offer 10 斐波那契数列
 * @author: ding
 * @create: 2021/09/04 23:00
 */
public class Offer010 {
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
