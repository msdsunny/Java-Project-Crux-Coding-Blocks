package lecthree;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		int length = s.length();
		int i = 0;
		while (i <= length){
			int j = 0;
			while (j <= length){
				if (i < j){
					System.out.println(s.substring(i,j));
				}
				j++;
			}
			i++;
		}

	}

}
