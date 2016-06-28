package mainHome;

import java.util.ArrayList;
import java.util.Scanner;

public class countLexPer {
	public static int total = 0;
//	public static int s = 'a'; // 97
//	public static int a = 'z'; // 122
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		char s = str.charAt(0);
		ArrayList<String> all = validNoOfLeafNodes(str);
		int Index = 's';
		count (all,Index);
		System.out.println(total);
	}
	public static int lex(String str){
		int[] farr = new int[str.length() - 1];
		
		int initfactorial  = 1;
		for (int  i = 0;i < farr.length; i++){
			farr[i] = initfactorial;
			initfactorial = initfactorial*(i + 2);
		}
		//return farr;
	}
	public static int lexa(String str,int[] farr){
		int retval = 0;
		for (int i = 0;i < str.length() - 1;i++){
			int count = 0;
			for (int j = i + 1;j < str.length();j++){
				if (str.charAt(j) > str.charAt(i)){
					count++;
				}
			}
			return lexa(str,farr);
		}
		return retval ;
	}
	public static void count (ArrayList<String> all,int Index){
		if (all.isEmpty()){
			return;
		} 
		for (int i = 0;i < all.size();i++){
			String s1 =	all.get(i);
			char cc = s1.charAt(0);
			int temp = cc;
			if (cc > Index){
				for (int j = 0;j < all.size();j++){
					total++;
				}
			}
		}
	}
	public static ArrayList<String> validNoOfLeafNodes (String str){
		if (str.length() == 1){
			ArrayList<String> current = new ArrayList<>();
			current.add(str);
			return current;
		}
		ArrayList<String> current = new ArrayList<>();
		
		for (int i = 0;i < str.length();i++){
			
			char cc = str.charAt(i);
			String res = str.substring(0,i) + str.substring(i+1);
			ArrayList<String> resPer = validNoOfLeafNodes(res);
			for(int j = 0; j <resPer.size();j++){
				current.add(cc + resPer.get(j));
			}
		}
		return current;
	}
	
}