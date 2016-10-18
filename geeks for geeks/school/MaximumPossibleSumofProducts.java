package school;

import java.util.Scanner;

public class MaximumPossibleSumofProducts {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		while (test > 0){
			int size = read.nextInt();
			int[] arr = input(size);
			int[] brr = input(size);
			bubble(arr);
			bubble(brr);
			int total = maximun(arr, brr);
			System.out.println(total);
			test--;
		}
		read.close();
	}
	public static void bubble (int[] arr){
		for (int j = 0;j < arr.length - 1;j++){
			for (int i = 0;i < arr.length - j - 1;i++){
				if (arr[i] > arr[i + 1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	public static int[] input (int size){
		Scanner in = new Scanner (System.in);
		int[] arr = new int[size];
		for (int i = 0;i < size;i++){
			arr[i] = in.nextInt();
		}
		in.close();
		return arr;
	}
	public static int maximun (int[] arr,int[] brr){
		int total = 0;
		for (int i = 0;i < arr.length;i++){
			total = total + arr[i]*brr[i];
		}
		return total;
	}
}
