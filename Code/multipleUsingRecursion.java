package mainHome;

import java.util.Scanner;

public class multipleUsingRecursion {

	public static void main(String[] args) {
		System.out.println("enter the value of m and n :");
		Scanner read = new Scanner (System.in);
		int m = read.nextInt();
		int n = read.nextInt();
		int ans = multipleUsingRecursion(m, n);
		System.out.println(ans);
	}
	public static int multipleUsingRecursion(int m,int n){
		if (n == 1){
			return m;
		}
		int temp = m + multipleUsingRecursion(m, n - 1);
		return temp;
	}
}
