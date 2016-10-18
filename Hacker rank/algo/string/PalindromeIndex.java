package algo.string;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		System.out.println("enter the the no. pf test cases :");
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i = 0;
		while (i < test){
			Scanner in = new Scanner (System.in);
			String str = in.nextLine();
			int ans = palindromeIndex(str);
			System.out.println(ans);
			i++;
		}
	}
	public static int palindromeIndex(String str){
		boolean check = checkp(str);
		if (check == true){
			return -1;
		}else{
			for (int i = 0;i < str.length();i++){
				String cut = str.substring(0,i) + str.substring(i+1,str.length());
				int item = i;
				boolean temp = checkp(cut);
				if (temp == true){
					return item;
				}
			}
		}
		return -1;
	}
	public static boolean checkp (String str){
		for (int i = 0;i < str.length()/2;i++){
			char ch = str.charAt(i);
			char ch1 = str.charAt(str.length() - i -1);
			if (ch != ch1){
				return false;
			}
		}
		return true;
	}
}
