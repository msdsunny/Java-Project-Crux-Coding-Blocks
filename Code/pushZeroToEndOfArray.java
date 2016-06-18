package mainHome;

import java.util.Scanner;

public class pushZeroToEndOfArray {

	public static void main(String[] args) {
		int[] arr = input();
		int[] brr = allZeroAtEnd(arr);
		output(brr);
	}
	public static void output (int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
	public static int[] input (){
		System.out.println("Enter the size of array :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int [size];
		for (int i = 0;i < size;i++){
			System.out.println("enter the "+ i +"th element");
			arr[i] = read.nextInt();
		}
		return arr;
	}
	public static int[] allZeroAtEnd (int[] arr){
		int[] brr = new int [arr.length];
		int count = 0;
		int j = 0;
		for (int i = 0;i < arr.length;i++){
			if(arr[i] == 0){
				count++;
			}else{
				brr[j] = arr[i];
				j++;
			}
		}
		while (count <= 0){
			brr[j] = 0;
			j++;
			count--;
		}
		return brr;
	}
}
