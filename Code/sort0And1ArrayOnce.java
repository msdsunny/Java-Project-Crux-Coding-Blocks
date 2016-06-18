package mainHome;

import java.util.Scanner;

public class sort0And1ArrayOnce {

	public static void main(String[] args) {
		int[] arr = input();
		sort0And1(arr);
		output(arr);
//		0 1 1 0 0 1 0 1
	
	}
	public static int[] input (){
		System.out.println("enter the size of array :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int[size];
		for (int i = 0;i<size;i++){
			System.out.println("enter the "+i+" th element");
			arr[i] = read.nextInt();
		}
		return arr;
	}
	public static void output (int[] arr){
		for (int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
	}
	public static void sort0And1 (int[] arr){
		int low = 0;
		int high = arr.length - 1;
		for (int i = 0;i < arr.length;i++){
			if (low >= high){
				break;
			}else if (arr[low] == arr[high] && arr[high] == 0){
				low++;
			}else if (arr[low] == arr[high] && arr[high] == 1){
				high--;
			}else if(arr[low] == 0 && arr[high] == 1){
				low++;
				high--;
			}else if(arr[low] == 1 && arr[high] == 0){
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
	}

}
