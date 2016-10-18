package algo.Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
//		System.out.println("enter array and limit sum :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int sum = read.nextInt();
		int[] arr = new int [size];
		for (int i =0;i < size;i++){
			arr[i] = read.nextInt();
		}
		int counter = countPairs(arr, sum);
		System.out.println(counter);
	}
	public static int countPairs (int[] arr,int sum){
		int count = 0;
		for (int i = 0;i < arr.length;i++){
			int one = arr[i];
			for (int j = i + 1;j < arr.length;j++){
				int two = arr[j];
				if ((one + two)% sum == 0){
					count = count + 1;
				}
			}
		}
		return count;
	}
}
