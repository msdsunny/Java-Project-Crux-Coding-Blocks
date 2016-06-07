package lecthree;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("enter your string :");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		int mid = s.length();
		int i = 0;
		while (i < mid){
			if(s.charAt(i) == s.charAt(s.length() - i - 1)){
				System.out.println("palindrome.");
			}else{
				System.out.println("not palindrome.");
				break;
			}
			i++;
		}
	}

}
