package mainHome;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		int result = 0;
		Scanner read = new Scanner(System.in);
		int num1 = read.nextInt();
		int num2 = read.nextInt();
		char input = read.next().charAt(0);
		int text = input;
		if(input == '+'){
			System.out.println("plus is:");
			result = num1 + num2;
			System.out.println(result);
		}else if(input == '-'){
			System.out.println("subtraction is:");
			result = num1 - num2;
			System.out.println(result);
		}else if(input == '*'){
			System.out.println("mul is:");
			result = num1 * num2;
			System.out.println(result);
		}else if(input == '/'){
			System.out.println("division is:");
			result = num1 / num2;
			System.out.println(result);
		}else if(input == '%'){
			System.out.println("modulo is:");
			result = num1%num2;
			System.out.println(result);
		}
		

	}

}
