package algo.string;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		String good = cutIt(str);
		boolean till = Pangram(good);
		if (till == true){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}
	public static String cutIt (String str){
		String retval = "";
		for (int i = 0;i< str.length();i++){
			char ch = str.charAt(i);
			int put = ch;
			if (put >= 97 && put <= 122){
				retval += ch;
			}
			if (put >= 65 && put <= 90){
				retval += ch;
			}
		}
		return retval;
	}
	public static boolean Pangram (String str){
		if (str.length() >= 26){
			for (int i = 0;i < str.length();i++){
				int flag = 0;
				char ch = 'a';
				int temp = ch;
				temp = temp + i;
				for (int j = 0;j < str.length();j++){
					char ch2 = str.charAt(j);
					int check = ch2;
					if (temp >= 123){
						flag = 1;
						break;
					}
					if (temp == check || temp - 32 == check){
						flag = 1;
						break;
					}
				}
				if (flag == 0){
					return false;
				}
			}
			return true ;
		}
		return false ;
	}
}
