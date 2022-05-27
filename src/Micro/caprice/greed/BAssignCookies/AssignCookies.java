package Micro.caprice.greed.BAssignCookies;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 455. 分发饼干
 * @author: ding
 * @create: 2022/05/27 00:23
 */
public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		if (g.length == 0) {
			return 0;
		}
		int ans = 0;
		for (int i = 0; i < g.length; i++) {
			if (i > s.length || g[i] > s[i]) {
				return ans;
			}
			ans++;
		}

		return ans;
	}

	public int find2(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		if (g.length == 0) {
			return 0;
		}
		int ans = 0;
		int index = s.length - 1;
		for (int i = s.length - 1; i >= 0; i--) {
			if (index >= 0 && s[index] >= g[i]) {
				ans++;
				index--;
			}
		}

		return ans;
	}
}
