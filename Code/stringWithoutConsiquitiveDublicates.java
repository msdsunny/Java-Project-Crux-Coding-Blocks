package mainHome;

import java.util.Scanner;

public class stringWithoutConsiquitiveDublicates {

	public static void main(String[] args) {
		System.out.println("Enter your string :");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		int length = s.length();
		int temp = 0;
		System.out.print(s.charAt(0));
		while (temp < length-1){
			if (s.charAt(temp) == s.charAt(temp + 1)){
				temp++;
			}else if (s.charAt(temp) != s.charAt(temp + 1)){
				System.out.print(s.charAt(temp + 1));
				temp++;
			}
		}
		read.close();
	}

}
