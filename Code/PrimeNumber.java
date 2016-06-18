package mainHome;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i = 2;
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		if (i <= num){
			if (num%i != 0){
				i = i + 1;
			}else{
				System.out.println("the number is not prime");
			}
		}else{
		System.out.println("the number is prime");
		}
	}

}
