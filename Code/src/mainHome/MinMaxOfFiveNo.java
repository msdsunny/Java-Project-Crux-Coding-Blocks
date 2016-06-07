package mainHome;

import java.util.Scanner;

public class MinMaxOfFiveNo {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("enter the first no. :");
		int num1 = read.nextInt();
		System.out.println("enter the second no. :");
		int num2 = read.nextInt();
		System.out.println("enter the third no. :");
		int num3 = read.nextInt();
		System.out.println("enter the fourth no. :");
		int num4 = read.nextInt();
		System.out.println("enter the fifth no. :");
		int num5 = read.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println("the max no. is: ");
		if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5){
			System.out.println("the greatest no, :");
			System.out.println(num1);
		}else if(num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5){
			System.out.println("the greatest no, :");
			System.out.println(num2);
		}else if(num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5){
			System.out.println("the greatest no, :");
			System.out.println(num3);
		}else if(num4 >= num1 && num4 >= num3 && num4 >= num2 && num4 >= num5){
			System.out.println("the greatest no, :");
			System.out.println(num4);
		}else if(num5 >= num1 && num5 >= num3 && num5 >= num4 && num5 >= num2){
			System.out.println("the greatest no, :");
			System.out.println(num2);
		}
		System.out.println("the min no. is :");
		if (num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5){
			System.out.println("the least no, :");
			System.out.println(num1);
		}else if(num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5){
			System.out.println("the least no, :");
			System.out.println(num2);
		}else if(num3 <= num1 && num3 <= num2 && num3 <= num4 && num3 <= num5){
			System.out.println("the least no, :");
			System.out.println(num3);
		}else if(num4 <= num1 && num4 <= num3 && num4 <= num2 && num4 <= num5){
			System.out.println("the least no, :");
			System.out.println(num4);
		}else if(num5 <= num1 && num5 <= num3 && num5 <= num4 && num5 <= num2){
			System.out.println("the least no, :");
			System.out.println(num2);
		}
	}

}
