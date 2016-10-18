package algo.string;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		int a = 'a'; // 97
		int b = 'z'; // 122
		int c = 'A'; // 65
		int d = 'Z'; // 90
//		acxz
//		bcxz
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int i = 0;
		while (i < size){
			Scanner in = new Scanner (System.in);
			String Funny = in.nextLine();
			boolean ans = funnyFunction(Funny);
			if (ans == true){
				System.out.println("Funny");
			}else{
				System.out.println("Not Funny");
			}
			i++;
		}
	}
	public static boolean funnyFunction (String Funny){
		String start = Funny.substring(0,Funny.length()/2);
		int size = Funny.length();
		String end;
		if (size%2 == 0){
			end = Funny.substring(Funny.length()/2);
		}else{
			end = Funny.substring(Funny.length()/2 + 1);
		}
		if (start.length() == end.length()){
			int flag = 0;
			for (int i = 0;i < start.length();i++){
				char ch = start.charAt(i);
				char ch1 = end.charAt(start.length() - i - 1);
				int chitem = (int)ch;
				int ch1item = (int)ch1;
				int count = 0;
				for (int j = 0;i < 26;j++){ // big
					int temp = 97 + j;
					if (temp <= chitem){
						count++;
					}else{
						break;
					}
				}
				int temp = 0;
				for (int k = 0;k<count;k++){
					temp = 122 - k;
					if (temp == ch1item){
						flag = 1;
						break;
					}else{
						flag = 0;
					}
				}
			}
			if (flag == 1){
				return true;
			}else if (flag == 0){
				return false;
			}
		}
		return false;
	}
}
