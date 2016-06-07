package lecthree;

import java.util.Scanner;

public class SquareRootComputerApproch {

	public static void main(String[] args) {
		System.out.println(3.11 + 0.01);
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		int sqrt = 0;
		int increment = 1;
		while (sqrt * sqrt <= n){
			sqrt = sqrt + increment;
		}
		System.out.println(sqrt - increment);
		
		

	}

}
