package mainHome;

import java.util.Scanner;

public class lexicalPrint {

	public static void main(String[] args) {
		lexicalPrint(1);
	}
	public static int start = 1;
	public static void lexicalPrint (int x){
		if (x  > 1000){// change here for limit
			return;
		}
		System.out.println(x);
		for (int i = 0;i < 10;i++){
			int temp = x*10 + i;
//			System.out.println(temp);
			lexicalPrint (temp);
		}
		
	}
}
