package school;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);
	int size = read.nextInt();
	int i = 0;
	while (i < size){
		int t = read.nextInt();
		int[] arr = input(t);
		int[] brr = input(t);
		int comb = 0;
		for (int j = 0;j < arr.length;j++){
			if(j == 0){
				if(arr[j] >= brr[j]){
					comb++;
				}
			}else{
				if(arr[j] - arr[j - 1] >= brr[j]){
				comb++;
				}
			}
			
		}
		System.out.println(comb);
		i++;
	}
	
	}
	public static int[] input (int size){
		Scanner read = new Scanner (System.in);
		int i = 0;
		int[] arr = new int[size];
		while (i < size){
			arr[i] = read.nextInt();
			i++;
		}
		return arr;
	}
}
