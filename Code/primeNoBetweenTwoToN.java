package mainHome;

import java.util.Scanner;

public class primeNoBetweenTwoToN {

	public static void main(String[] args) {
		System.out.println("Enter your limit no. :");
		Scanner read = new Scanner (System.in);
		int N = read.nextInt();
		System.out.println(2);
		boolean prime = false;
		for(int i= 3; i <= N; i++){
			prime = true;
			for(int n = 2;n <= i - 1;n++){
				if(i % n == 0){
					prime = false;
				}
			}
			if(prime){
				System.out.println(i);
			}
		}
		
		
		
	}

}
