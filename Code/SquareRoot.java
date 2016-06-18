package mainHome;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();
		int n = (int)Math.sqrt(num);
		System.out.println(n);
	}

}
