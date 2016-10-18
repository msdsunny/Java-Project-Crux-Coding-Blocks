package school;

import java.util.Scanner;

public class Checkifgivenfourpointsformasquare {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int i = 0;
		while (i < size){
			int[] arr = new int [8];
			for (int j = 0;j < 8;j++){
				arr[j] = read.nextInt();
			}
			boolean result = check(arr);
			System.out.println(result);
			i++;
		}
		read.close();
	}
	public static boolean check (int[] arr){
		int one = (arr[2] - arr[0])*(arr[2] - arr[0]) + (arr[3] - arr[1])*(arr[3] - arr[1]);
		int two = (arr[6] - arr[4])*(arr[6] - arr[4]) + (arr[7] - arr[5])*(arr[7] - arr[5]);
		if (one == two){
			return true;
		}else{
		return false;
		}
	}
}