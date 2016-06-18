package mainHome;

import java.util.Scanner;

public class MultipleLessTillN {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int x = read.nextInt();
		int n = read.nextInt();
		int temp = 0;
		int result = 1;
		while (temp < n){
			result = result*x;
			temp = temp + 1;
		}
		System.out.println(result);

	}

}
