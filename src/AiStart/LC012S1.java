package AiStart;

/**
 * @program Before2020
 * @description: 12.整数转罗马数字
 * @author: ding
 * @create: 2021/05/14 23:00
 */
public class LC012S1 {
	public String intToRoman(int num) {
		String[] thousands = {"", "M", "MM", "MMM"};
		String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

		StringBuffer roman = new StringBuffer();
		roman.append(thousands[num / 1000]);
		roman.append(hundreds[num % 1000 / 100]);
		roman.append(tens[num % 100 / 10]);
		roman.append(ones[num % 10]);
		return roman.toString();

	}
}
