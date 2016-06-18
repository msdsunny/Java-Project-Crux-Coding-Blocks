package mainHome;

import java.util.ArrayList;
import java.util.Scanner;

public class permutationsOfString {

	public static void main(String[] args) {
//		Scanner read = new Scanner (System.in);
//		String s = read.nextLine();
		ArrayList<String> all = per("abc");
		System.out.println(all);
	}
	public static ArrayList<String> per (String str){
		if (str.length() == 1){
			ArrayList<String> current = new ArrayList<>();
			current.add(str);
			return current;
		}
		ArrayList<String> current = new ArrayList<>();
		for (int i = 0;i < str.length();i++){
			
			char cc = str.charAt(i);
			String res = str.substring(0,i) + str.substring(i+1);
			ArrayList<String> resPer = per(res);
			for(int j = 0; j <resPer.size();j++){
				current.add(cc + resPer.get(j));
			}
		}
		return current;
	}
	
}