package mainHome;

import java.util.Scanner;

public class ChechUpperCaseAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		char start1 = read.next().charAt(0);
		int one = start1;
		System.out.println(one);// 97 to 112 and 65 to 90
		if(one >= 65 && one <= 90){
			System.out.println("the entered char is in upper case");
		}else if(one >= 97 && one <= 122){
			System.out.println("the entered char is in lower case");
		}
	}

}
