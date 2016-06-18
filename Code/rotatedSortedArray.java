package mainHome;

import java.util.Scanner;

public class rotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = input();
		int total = printNoOfRotations(arr);
		System.out.println("the sortes array is rotated " + total + " times");
	}
	public static int printNoOfRotations (int[] arr){
		int counter = 0;
		for (int i = 0;i < arr.length - 1;i++){
			if (arr[i] > arr [i+1]){
				counter = i + 1 ;
			}
		}
		return counter;
	}
	public static int[] input (){
		System.out.println("Enter the ize of array :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int [size];
		for (int i = 0;i < size;i++){
			System.out.println("enter the "+ i +" th element :");
			arr[i] = read.nextInt();
		}
		return arr;
	} 
	public static void output (int[] arr){
		for (int i = 0;i < arr.length;i++){
			System.out.println(arr[i] + "\t");
		}
	}
}
