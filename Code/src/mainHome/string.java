package lecthree;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		String s = "hello";
		
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		
		System.out.println(s.substring(3));
		System.out.println(s.substring(2, 2)); // nothing
		System.out.println(s.substring(2,3));
		
		String s1 = "hello who";
		String s2 = "hello me ";
		
		s2 = s.concat(s1);// s2 not change
		System.out.println(s.startsWith("hello"));// true
		System.out.println(s.startsWith("ello"));// false
		// not use string use buffer and builder;
		System.out.println(s1.indexOf("w "));//5
		System.out.println(s1.indexOf(" w"));//false so -1
		
		Scanner read = new Scanner (System.in);
		String hhh = read.nextLine();
	}

}
