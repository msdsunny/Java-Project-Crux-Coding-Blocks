package mainHome;

import java.util.Scanner;

public class highestOccuringCharInString {

	public static void main(String[] args) {
		char high = ' ';
		char tempchar = ' ';
		int temp = 0;
		int count ;
		System.out.println("Enter your string :");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		for (int i = 0;i < s.length();i++){
			count = 0;
			tempchar = s.charAt(i);
			for (int k= 0;k < s.length();k++){
				if (s.charAt(i) == s.charAt(k)){
					count++;
				}
			}
			if (temp <= count){
				temp = count;
				high = s.charAt(i);
			}
			//System.out.println("count for " + s.charAt(i) + " is :" + count);
		}
		System.out.println(high);
		System.out.println(temp);

	}

}
