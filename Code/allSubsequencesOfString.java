package mainHome;

import java.util.Scanner;

public class allSubsequencesOfString {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		String s = read.nextLine();
		String[] str = sub(s); 
		output (str);
	}
	public static void output(String[] arr){
		int j = 0;
		while (j < arr.length){
			System.out.println(arr[j]);
			j++;
		}
	}
	public static String[] sub (String str){
		if (str.length() == 0){
			return new String []{" "}; 
		}
		String[] smaller = sub(str.substring(1));
		String[] current = new String [2*smaller.length];
		
		int counter = 0;
		for (String ss:smaller){
			current[counter] = ss;
			counter++;
		}
		for (String ss: smaller){
			current[counter] = str.charAt(0) + ss;
			counter++;
		}
		return current;
	}

}
