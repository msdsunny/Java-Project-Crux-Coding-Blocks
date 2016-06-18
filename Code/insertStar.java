package mainHome;

import java.util.Scanner;

public class insertStar {

	public static void main(String[] args) {
		System.out.println("enter the string with repeted letters :");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		String s = insertStar(str);
		System.out.println(s);
	}
	public static String insertStar (String str){
		if(str.length() == 1){
			return str;
		}
		if (str.charAt(0) == str.charAt(1)){
			return str.charAt(0) + "*" + insertStar(str.substring(1));
		}else{
			return str.charAt(0) + insertStar(str.substring(1));
		}
	}
}
