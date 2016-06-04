package mainHome;

import java.util.Scanner;

public class eighth {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int number = read.nextInt();
		char input = read.next().charAt(0);
		int sum = 0;int temp = 0;
		int value = input;
		int result = 0;
		int start = 0;
		while (temp <= number){
			if(value == '+'){
				start = start + 1;
				result = result + start;
				sum = sum + result;
			}else if(value == '*'){
				result = 1;
				start = start + 1;
				result = result * start;
				sum = sum + result;
			}
			
			temp++;
		}
		System.out.println("the final result to n is :");
		System.out.println(result);

	}

}
