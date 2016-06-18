package mainHome;

import java.util.Scanner;

public class stringToANumber {

	public static void main(String[] args) {
		System.out.println("enter the no in form of string :");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		int num = stringToANumber(str);
		System.out.println(num);
	}
	public static int stringToANumber (String str){
		if (str.length() == 0){
			return 0;
		}
		
		int x = str.charAt(str.length() - 1) - '0';
		return x + 10*stringToANumber(str.substring(0,str.length() - 1));
	}
}
