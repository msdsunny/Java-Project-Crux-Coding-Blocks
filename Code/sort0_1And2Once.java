package mainHome;

import java.util.Scanner;

public class sort0_1And2Once {

	public static void main(String[] args) {
		int[] arr = input();
		int[] brr = sort0_1And2Once(arr);
		output(brr);
	}
	public static int[] sort0_1And2Once (int[] arr){
		int[] brr = new int[arr.length];
		int zero = 0;int one = 0;int two = 0;
		for (int i = 0;i < arr.length;i++){
			if (arr[i] == 0){
				zero++;
			}else if(arr[i] == 1){
				one++;
			}else if(arr[i] == 2){
				two++;
			}
		}
		for (int i = 0;i < arr.length;i++){
			while(zero <= 0){
				System.out.println("0");
				brr[i] = 0;
				zero--;
			}
			while(one <= 0){
				System.out.println("1");
				brr[i] = 1;
				one--;
			}
			while(two <= 0){
				System.out.println("2");
				brr[i] = 2;
				two--;
			}
		}
		return brr;
	}
	public static void output (int[] arr){
		for (int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
	// 0 2 1 0 2 1 2 1 0 1 0 2 0
	public static int[] input (){
		System.out.println("enter the size of array :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int [size];
		for (int i = 0;i < size;i++){
			System.out.println("enter the "+i+" th element");
			arr[i] = read.nextInt();
		}
		return arr;
	}
}
