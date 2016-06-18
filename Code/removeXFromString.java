package mainHome;

import java.util.Scanner;

public class removeXFromString {

	public static void main(String[] args) {
		System.out.println("enter a string with x :");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		int length = 0;
		String ans = removeXFromString(str);
		System.out.println(ans);
	}
	public static String removeXFromString (String str){
		if (str.length() == 1){
			if (str.charAt(0) == 'x'){
				return "" ;
			}else{
				return str;
			}
		}
		if (str.charAt(0) == 'x'){
			return removeXFromString(str.substring(1));
		}else{
			return str.charAt(0) + removeXFromString(str.substring(1));
		}
	}
}
