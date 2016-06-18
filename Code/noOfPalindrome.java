package mainHome;

import java.util.Scanner;

public class noOfPalindrome {

	public static void main(String[] args) {
		System.out.println("enter the string :");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		int some = noOfSubstring(s);
		System.out.println(some);
	}
	public static int noOfSubstring(String s){
		int count = 0;
		for (int i = 0;i < s.length();i++){
			int j = 0;
			while (i - j >= 0 && i+j <s.length() && s.charAt(i-j) == s.charAt(i+j)){
				count ++;
				j++;
			}
		}
		for (int i = 0;i<s.length();i++){
			int j = 1;
			while (i - j >= 0 && i+j-1 <s.length() && s.charAt(i-j) == s.charAt(i+j-1)){
				count ++;
				j++;
			}
		}
		return count;
	}
}
