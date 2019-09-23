package LoseAndRegret.Code001;

import java.util.Scanner;

/**
 * @program Before2020
 * @description: 全排列
 * @author: ding
 * @create: 2019/09/22 23:48
 */
public class FullSort {

	private static int total;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String res = "";
			int[] ints = new int[n];
			for (int i = 0; i < n; i++) {
				ints[i] = i + 1;
			}
			for (int i = 0; i < n; i++) {
				fullSort(ints, ints[i], res);
			}

			System.out.println("total is " + total);
			total =0;
		}
	}

	private static void fullSort(int[] ints, int flag, String res) {
		res = res + flag + " ";
		if (ints.length == 1) {
			total++;
			System.out.println(res + "\r");
		} else {
			int[] newInts = new int[ints.length-1];
			for (int i = 0, j = 0; i < ints.length && j < newInts.length; i++, j++) {
				if (ints[i] == flag) {
					newInts[j] = ints[i + 1];
					i++;
				} else {
					newInts[j] = ints[i];
				}
			}
			for (int i = 0; i < newInts.length; i++) {
				fullSort(newInts, newInts[i], res);
			}
		}
	}
}
