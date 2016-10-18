package school;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i =0;
		while (i < test){
			int[] arr = input();
			boolean show = some(arr,4);
			i++;
		}
	}
	public static boolean some (int[] arr,int sum){
		for (int i = 0;i < arr.length;i++){
			int curr_sum = arr[i];
			for (int j = i + 1;j <= arr.length;j++){
				if (curr_sum == sum)
					return true;
				if (curr_sum > sum || j == arr.length){
					break;
				}
				curr_sum = curr_sum + arr[j];
			}	
		}
		return false;
	}
	public static boolean check(int[] arr){
		int[] one = new int[arr.length/2 + 1];
		int[] two = new int[arr.length/2 + 1];
		for (int i = 0;i < arr.length;i++){
			
		}
		return false;
	}
	public static int[] input (){
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int i = 0;
		int[] arr = new int[size];
		while (i < size){
			arr[i] = read.nextInt();
			i++;
		}
		return arr;
	}
}
