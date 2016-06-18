package mainHome;

import java.util.Scanner;

public class ZeroInIntigerRec {

	public static void main(String[] args) {
		System.out.println("enter a no. :");
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();
		int ans = ZeroInIntigerRec(num, 0);
		System.out.println(ans);
	}
	public static int ZeroInIntigerRec (int num,int total){
		if (num / 10 == 0){
			if(num % 10 == 0){
				return 1;
			}else{
				return 0;
			}
		}
		if(num % 10 == 0){
			int temp = ZeroInIntigerRec(num/10, total);
			total = total + temp + 1;
		}else{
			int temp = ZeroInIntigerRec(num/10, total);
			total = total + temp;
		}
		return total;
	}
}
