package mainHome;

import java.util.Scanner;

public class recursiveBubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		recBubble (arr,arr.length - 1);
	}
	public static void recBubble (int[] arr,int index){
		if (arr.length == 0){
			
		}
		for (int i = 0;i < arr.length - index - 1;i++){
			if (arr[i] > arr[i + 1]){
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		recBubble(arr,index - 1);
	}
	public static void output(int[] arr){
		int j = 0;
		while (j < arr.length){
			System.out.println(arr[j]);
			j++;
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
	public static void bubble (int[] arr){
		//System.out.println("your sorted array is :");
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
}
