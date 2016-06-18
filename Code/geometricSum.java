package mainHome;

import java.util.Scanner;

public class geometricSum {

	public static void main(String[] args) {
		System.out.println("enter the value of k :");
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();
		double ans = geometricSum(num, 1);
		System.out.println(ans);
	}
	public static double geometricSum (int k,int a){
		 if(k == 0)
	            return 1;
	        a = a*2;
	        return ((float)1/a) + geometricSum(k-1, a);
	}
}
