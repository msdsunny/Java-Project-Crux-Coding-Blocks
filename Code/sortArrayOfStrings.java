package mainHome;

import java.util.Scanner;

public class sortArrayOfStrings {

	public static void main(String[] args) {
		String[] s = {"i","am","out","touch","i am","out","love","remember"};
		int large = 0;
		String largest = " ";
		for (int i = 0;i < s.length;i++){
			String temp = s[i];
			if (large <= s[i].length()){
				largest = s[i];
				large = largest.length();
			}
		}
		System.out.println("The largest int the given array of string is:");
		System.out.println(largest + " the length is :" + large);
	}
}
