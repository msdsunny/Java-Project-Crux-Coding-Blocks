package algo.Implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
//		System.out.println("enter the value of x1, v1, x2 and v2");
		Scanner read = new Scanner (System.in);
		int x1 = read.nextInt();
		int v1 = read.nextInt();
		int x2 = read.nextInt();
		int v2 = read.nextInt();
		boolean check = tellMe(x1, v1, x2, v2);
		if (check == true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	public static boolean tellMe (int x1,int v1,int x2,int v2){
		if (x1 < x2 && v1 < v2){
			return false;
		}
		int value1 = x1;
		int value2 = x2;
		for (int i = 0;i < 100000;i++){
			if (value1 == value2){
				return true;
			}
			value1 += v1;
			value2 += v2;
		}
		return false;
	}
}
