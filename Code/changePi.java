package mainHome;

import java.util.Scanner;

public class changePi {

	public static void main(String[] args) {
		System.out.println("enter a string with pi :");
		Scanner read = new Scanner (System.in);
		String str  = read.nextLine();
		String finalString = changePi(str);
		System.out.println(finalString);
	}
	public static String changePi (String str){
		if(str.length() < 2){
			return str;
		}
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
			return "3.14" + changePi(str.substring(2));
		}else if(str.charAt(1) == 'p'){
			return str.charAt(0) + changePi(str.substring(1));
		}else {
			return str.substring(0,2) + changePi (str.substring(2));
		}
	}
}
