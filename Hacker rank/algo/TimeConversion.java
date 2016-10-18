package algo;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
//		System.out.println("enter the time in 24 hour format :");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		String ans = convertTime(str);
		System.out.println(ans);
	}
	public static String convertTime (String str){
		// ascii value 0 = 48 1 = 49 2 = 50  00:00:00pp
		int one = 0;
		int two = 0;
		String change = "";
		if (str.charAt(8) == 'P'){
			one = 1;
			two = 2;
		}else if (str.charAt(8) == 'A'){
			one = 0;
			two = 0;
		}
		if (str.charAt(0) == '1' && str.charAt(1) == '2' && str.charAt(8) == 'A'){
			String cast = "";
			cast += 0;
			cast += 0;
			cast += str.substring(2, str.length() - 2);
			return cast;
		}
		if (str.charAt(0) == '1' && str.charAt(1) == '2' && str.charAt(8) == 'P'){
			String cast = "";
			cast = str.substring(0, str.length() - 2);
			return cast;
		}
		int a = str.charAt(0)- 48 + one;
		int b = str.charAt(1) - 48 + two;
		change += a;
		change += b + str.substring(2, str.length() - 2);
		return change;
	}
}
