package lecthree;

import java.util.Scanner;

public class string_example {

	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		int i = 0;
		int j = 0;
		while (i < s.length()){
			System.out.println(s.charAt(i));
			i++;
		}

	}

}
