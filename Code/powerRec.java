package mainHome;

import java.util.Scanner;

public class powerRec {

	public static void main(String[] args) {
		System.out.println("Enter the value of x and n. :");
		Scanner read = new Scanner (System.in);
		int x = read.nextInt();
		int num = read.nextInt();
		int value  = pow(x,num);
		System.out.println(value);
	}
	public static int pow (int x,int num){
		int power = num;
		int base = x;
		if (power == 1){
			return x;
		}
		int result = base * pow (x,num - 1);
		return result;
	}
}
