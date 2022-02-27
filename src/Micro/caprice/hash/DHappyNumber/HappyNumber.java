package Micro.caprice.hash.DHappyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @program Before2020
 * @description: 202.快乐数
 * @author: ding
 * @create: 2022/02/27 16:21
 */
public class HappyNumber {
	public static void main(String[] args) {
		System.out.println(new HappyNumber().isHappy(3));
	}

	// 当我们遇到要快速判断一个元素是否出现在一个集合里时，就需要考虑哈希表法了

	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			n = getHappy(n);
		}

		return n == 1;
	}


	public int getHappy(int n) {
		int temp = 0;
		while (n > 0) {
			int m = n % 10;
			temp += m * m;
			n /= 10;
		}

		return temp;
	}
}
