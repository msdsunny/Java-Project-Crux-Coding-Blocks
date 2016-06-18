package mainHome;

import java.util.Scanner;

public class TripletsOfSumX {

	public static void main(String[] args) {
		int[] arr = input();
		int x = 3;
		threePair(arr,x);
	}
	public static void threePair (int[] arr,int x){
		//System.out.println("Enter the value of x :");
		//Scanner read = new Scanner (System.in);
		//int x = read.nextInt();
		for (int i = 0;i < arr.length;i++){
			for (int k = 1;k < arr.length;k++){
				for (int j = 2;j < arr.length;j++){
					if ((arr[i] + arr [j] + arr[k]) == x){
						int one = arr[i];
						int two = arr[k];
						int three = arr[j];
						System.out.println("triplets found :" + one + two + three);
					}else{
						continue;
					}
				}
			}
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
			System.out.println(arr[j]);
			j++;
		}
	}

}
