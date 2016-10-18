package school;

import java.util.Scanner;

public class ReversalAlgorithm {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int i = 0;
		while (i < size){
			int length = read.nextInt();
			int[] arr = input(length);
			int rotate = read.nextInt();
			rotateArr(arr,rotate);
			output(arr);
			i++;
		}
	}
	public static void rotateArr (int[] arr,int rotate){
		int j = 0;
		while (j < rotate){
			for (int i = 0;i < arr.length - 1;i++){
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
			j++;
		}
	}
	public static int[] input (int size){
		Scanner read = new Scanner (System.in);
		int[] arr = new int[size];
		for (int i = 0;i < size;i++){
			arr[i] = read.nextInt();
		}
		return arr;
	}
	public static void output (int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
}