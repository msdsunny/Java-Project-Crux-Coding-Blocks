package codeSprint;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		int value = value(s);
		System.out.println(value + 1);
	}
	public static int value (String s){
		int count = 0;
		for (int i = 0;i < s.length();i++){
			char ch = s.charAt(i);
			if ((int)ch >= 65 && (int)ch <= 90){
				count++;
			}
		}
		return count;
	}
}
