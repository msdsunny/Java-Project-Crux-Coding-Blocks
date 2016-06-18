package mainHome;

import java.util.Scanner;

public class bonus1 {
	public static void main(String[] args) {
		System.out.println("enter first arr value :");
		int[] arr = input();
		System.out.println("enter second arr value :");
		int[] brr = input();
		int[] crr = sumOfArray(arr, brr);
		output(crr);
	}
	public static void output (int[] crr){
		System.out.println("your desired array is :");
		for (int i = 0;i < crr.length;i++){
			System.out.println(crr[i]);
		}
	}
	public static int[] sumOfArray (int[] arr,int[] brr){
		int[] crr = new int [arr.length];
		if (arr.length != brr.length){
			return crr;
		}
		for (int i = 0;i < arr.length;i++){
			crr[i] = arr[i] + brr[i];
		}
		return crr;
	}
	public static int[] input (){
		System.out.println("Enter the size of array :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int [size];
		for (int i = 0;i<size;i++){
			System.out.println("enter the "+ i +" th element: ");
			arr[i] = read.nextInt();
		}
		return arr;
	}
}
