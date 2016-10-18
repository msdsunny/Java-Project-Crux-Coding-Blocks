package algo.string;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i =0;
		while (i < test){
			Scanner in = new Scanner (System.in);
			String str = in.nextLine();
			int count = delete(str);
			System.out.println(count);
			i++;
		}
	}
	public static int delete (String str){
		int count = 0;
		for (int i = 0;i < str.length() - 1 ;i++){
			if (str.charAt(i) == str.charAt(i + 1)){
				count++;
			}
		}
		return count;
	}
}
