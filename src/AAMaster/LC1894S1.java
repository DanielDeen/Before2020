package AAMaster;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 1894.找到需要补充粉笔的学生编号
 * @author: ding
 * @create: 2021/09/10 22:41
 */
public class LC1894S1 {
	public int chalkReplacer(int[] chalk, int k) {
		long sum = 0;
		for (int c : chalk) {
			sum += c;
		}
		int left = (int) (k % sum);
		for (int i = 0; i < chalk.length; i++) {
			if (left < chalk[i]) {
				return i;
			}
			left -= chalk[i];
		}
		return 0;
	}
}
