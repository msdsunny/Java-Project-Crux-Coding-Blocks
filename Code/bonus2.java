package mainHome;

import java.util.Scanner;

public class bonus2 {

	public static void main(String[] args) {
		System.out.println("Enter the string that is to be compressed :");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		stringCompression(s);
	}
	public static void stringCompression (String s){
		int count = 1;
		for (int i = 0;i < s.length();i++){
			if (i == s.length() - 1){
				System.out.print(s.charAt(i));
				if(count > 1){
					System.out.print(count);
					break;
				}
				break;
			}
			if (s.charAt(i) == s.charAt(i + 1)){
				count++;
			}else{
				if (count == 1){
					System.out.print(s.charAt(i));
				}else if(count > 1){
					System.out.print(s.charAt(i));
					System.out.print(count);
				}
			}
			if (s.charAt(i) != s.charAt(i + 1)){
				count = 1;
			}
		}
	}
}
