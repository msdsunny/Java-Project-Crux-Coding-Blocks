package school;

import java.util.Scanner;

public class school {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i = 0;
		while (i < test){
			int num = read.nextInt();
			int ans = profit(num,4);
			if (ans < num){
				ans = num;
			}
			System.out.println(ans);
			i++;
		}
	}
	public static int profit (int num,int at){
		if (at == 1){
			return 0;
		}
		int temp = num/(at ) + profit(num, at - 1);
		return temp;
	}

}
