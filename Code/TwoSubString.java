package lecthree;

import java.util.Scanner;

public class TwoSubString {
	public static void main(String[] args) {
		int current,prev,n;
		Scanner read = new Scanner (System.in);
		System.out.println("enter no.");
		n = read.nextInt();
		//first no.args
		prev = read.nextInt();
		boolean goingdown = true;
		int counter = 2;
		while (counter <= n){
			//new no.
			current = read.nextInt();
			
			if(goingdown){
				if (current >= prev){
					System.out.println("invalid");
					return;
				}
			}
			
			prev = current ;
			counter = counter + 1;
			
		}
		
		
	}
}
