package AiStart;

/**
 * @program Before2020
 * @description: 1310.子数组异或查询
 * @author: ding
 * @create: 2021/05/12 22:20
 */
public class LC1310S1 {
	public int[] xorQueries(int[] arr, int[][] queries) {
		int n = queries.length;
		int[] q = new int[n + 1];
		for (int i = 0; i < n; i++) {
			q[i + 1] = q[i] ^ arr[i];
		}

		int[] res = new int[n];
		for (int i = 0; i < n; i++) {
			res[i] = q[queries[i][0]] ^ q[queries[i][1] + 1];
		}
		return res;
	}
}
