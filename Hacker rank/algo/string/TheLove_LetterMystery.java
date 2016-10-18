package algo.string;

import java.util.Scanner;

public class TheLove_LetterMystery {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int test = Integer.parseInt(read.next(), 10);
//		 read.nextLine();
		int i = 0;
		while (i < test) {
			String str = read.next();
			int ans = conversion(str);
			System.out.println(ans);
			i++;
		}
	}

	public static int conversion(String str) {
		int count = 0;
		String first = "";
		String second = "";
		for (int i = 0; i < str.length() / 2; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(str.length() - i - 1);
			first += c1;
			second += c2;
		}
		String ref;
		String check;
		if (checkSeries(first) == true) {
			ref = first;
			check = second;
		} else {
			ref = second;
			check = first;
		}
		for (int i = 0; i < ref.length(); i++) {
			char cref = ref.charAt(i);
			char ccheck = check.charAt(i);
			if (cref != ccheck) {
				int ascref = cref;
				int asccheck = ccheck;
				int temp = 0;
				if (ascref > asccheck) {
					temp = ascref - asccheck;
				} else {
					temp = asccheck - ascref;
				}
				count += temp;
			}
		}
		return count;
	}

	public static boolean checkSeries(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			char c1 = str.charAt(i);
			char c2 = str.charAt(i + 1);
			int first = c1;
			int second = c2;
			if (second <= first) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkPalindromes(String str) {
		int temp = str.length();
		if (str.length() == 0) {
			return true;
		}
		if (temp % 2 == 0) {
			for (int i = 0; i < str.length() / 2; i++) {
				char ch = str.charAt(i);
				char ch2 = str.charAt(str.length() - i - 1);
				if (ch != ch2) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				char ch2 = str.charAt(str.length() - i - 1);
				if (ch != ch2) {
					return false;
				}
			}
		}
		return true;
	}
}
