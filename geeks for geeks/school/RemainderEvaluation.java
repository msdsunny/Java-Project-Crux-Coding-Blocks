package school;

import java.util.Scanner;

public class RemainderEvaluation {

	public static void main(String[] args) {
		System.out.println("enter the the no. of test cases :");
		int i = 0;
		Scanner read = new Scanner (System.in);
		int till = read.nextInt();
		while (i < till){
			int num1 = read.nextInt();
			int num2 = read.nextInt();
			int rem = remainder(num1, num2);
			System.out.println(rem);
			i++;
		}
	}
	public static int remainder (int num1,int num2){
		int rem = 0;
		rem = num1%num2;
		return rem;
	}
}
