package lecthree;

import java.util.Scanner;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int[] arr = input();
		int[] brr = input();
		//int[] crr =new int[100];
		//int[] crr = input();
		//output(arr);
		//output(brr);
		intersection(arr,brr);
		//System.out.println("the intersection array is:");
		//output (crr);

	}
	public static void intersection(int[] arr,int[] brr){
		int one,two;
		int i = 0;
		int j = 0;
		int z = 0;
		while (i <= arr.length - 1){
			one = arr[i];
			j=0;
			while (j <= brr.length - 1){
				two = brr[j];
				if (arr[i] == brr[j]){
					System.out.print("intersection found :");
					System.out.println(one + "," + two);
					//crr[z] = arr[i];
					//z = z + 1;
					}
				j = j + 1;
			}
			i = i + 1;
		}
	}
	public static int[] input(){
		System.out.println("enter the size");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while (i < size){
			System.out.println("enter the " + i +"th element");
			arr[i] = read.nextInt();
			i++;
		}	
		return arr;
	}
	public static void output(int[] arr){
		int j = 0;
		while (j < arr.length){
			System.out.print(arr[j]);
			System.out.println("\t");
			j++;
		}
	}
}
