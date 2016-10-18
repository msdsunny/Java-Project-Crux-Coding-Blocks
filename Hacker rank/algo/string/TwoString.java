package algo.string;

import java.util.Scanner;

public class TwoString {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i = 0;
		while (i < test){
			Scanner in = new Scanner (System.in);
			String first = in.nextLine();
			String second = in.nextLine();
			boolean ans = findaSubString(first,second);
			if (ans == true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			i++;
		}
	}
	public static boolean findaSubString(String first,String second){
		int flag = 0;
		for (int i = 0;i < first.length();i++){
			char cut = first.charAt(i);
			for (int j = 0;j < second.length();j++){
				char last = second.charAt(j);
				if(cut == last){
					flag = 1;
					return true;
				}
			}
		}
		return false;
	}
}
