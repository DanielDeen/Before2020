package Micro.caprice.backtracking.DIpAddress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program Before2020
 * @description: 93. 复原 IP 地址
 * @author: ding
 * @create: 2022/05/07 22:54
 */
public class RestoreIpAddresses {

	public static void main(String[] args) {
		System.out.println(new RestoreIpAddresses().restoreIpAddresses("25525511135"));
	}

	List<String> res = new ArrayList<>();

	public List<String> restoreIpAddresses(String s) {
		if (s.length() > 12) {
			return Collections.emptyList();
		}
		backtracking(s, 0, 0);
		return res;
	}

	public void backtracking(String str, int index, int pointNum) {
		if (pointNum == 3) {
			if (isValid(str, index, str.length() - 1)) {
				res.add(str);
			}
			return;
		}

		// i  index 两者的关系，需要辨识清楚！！！
		for (int i = index; i < str.length(); i++) {
			if (isValid(str, index, i)) {
				str = str.substring(0, i + 1) + "." + str.substring(i + 1);
				pointNum++;
				backtracking(str, i + 2, pointNum);
				pointNum--;
				str = str.substring(0, i+1) + str.substring(i + 2);
			} else {
				break;
			}
		}
	}

	public boolean isValid(String s, int start, int end) {
		if (start > end) {
			return false;
		}

		if (s.charAt(start) == '0' && start != end) {
			return false;
		}

		int num = 0;
		for (int i = start; i <= end; i++) {
			if (s.charAt(i) > '9' || s.charAt(i) < '0') {
				return false;
			}
			num = num * 10 + (s.charAt(i) - '0');
			if (num > 255) {
				return false;
			}
		}
		return true;
	}
}
