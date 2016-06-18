package mainHome;

import java.util.Scanner;

public class AllFibonacciLessThanN {

	public static void main(String[] args) {
		System.out.println("Enter the limit no. :");
		Scanner read = new Scanner (System.in);
		int N = read.nextInt();
		int i = 0;
		int num1 = 0;
		int num2 = 1;
		int result = 1;
		System.out.println(0);
		while (i <= N){
			System.out.println(result);
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			i = result;
		}
	}

}
