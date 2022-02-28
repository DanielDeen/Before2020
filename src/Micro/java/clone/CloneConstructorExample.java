package Micro.java.clone;

import java.util.Arrays;

/**
 * @program Before2020
 * @description: 拷贝
 * @author: ding
 * @create: 2022/02/28 01:32
 */
public class CloneConstructorExample {
	private int[] arr;

	public CloneConstructorExample() {
		arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i;
		}
	}

	public CloneConstructorExample(CloneConstructorExample origial) {
		arr = new int[origial.arr.length];
		for (int i = 0; i < origial.arr.length; i++) {
			arr[i] = origial.arr[i];
		}
	}


	public int getArr(int index) {
		return arr[index];
	}

	public void setArr(int index, int val) {
		arr[index] = val;
	}
}
