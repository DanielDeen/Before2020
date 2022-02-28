package Micro.java.clone;

/**
 * @program Before2020
 * @description: test
 * @author: ding
 * @create: 2022/02/28 01:36
 */
public class TestClone {
	public static void main(String[] args) {
		CloneConstructorExample cce1 = new CloneConstructorExample();
		CloneConstructorExample cce2 = new CloneConstructorExample(cce1);

		cce1.setArr(1,111);
		System.out.println(cce2.getArr(1));
	}
}
