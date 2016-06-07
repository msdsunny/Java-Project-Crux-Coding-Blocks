package lecthree;

import java.util.Scanner;


public class PrimeNoUsingFunction {
	
	public static void isPrime (int number){
		int counter = 2;
		int num = 0;
		while(num <= number){
			
			if (number%counter != 0){
				
				counter = counter +1;
				
			}else{
				System.out.println("your nuber is  prime");
				break;
			}
			num = num + 1;
			System.out.println("your number is  not prime");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("is prime:");
		Scanner read = new Scanner (System.in);
		int prime = read.nextInt();
		isPrime (prime);
		read.close();

	}
	
}
