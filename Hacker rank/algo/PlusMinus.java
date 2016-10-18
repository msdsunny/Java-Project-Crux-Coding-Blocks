package algo;

import java.util.Scanner;

public class PlusMinus {
	public static double pos = 0;
	public static double nev = 0;
	public static double zero = 0;
	public static void main(String[] args) {
//		System.out.println("enter the length and the elements of array :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int [size];
		for (int i = 0;i < size;i++){
			arr[i] = read.nextInt();
		}
		countAll(arr);
//		System.out.println(nev);
//		System.out.println(zero);
//		System.out.println(pos);
		double count = arr.length;
//		System.out.println(count);
		double positive = pos/count;
		double negetive = nev/count;
		double zeromain = zero/count;
		System.out.println(positive);
		System.out.println(negetive);
		System.out.println(zeromain);
	}
	public static void countAll (int[] arr){
		for (int i = 0;i< arr.length;i++){
			int temp = arr[i];
			if (temp < 0){
				nev = nev + 1;
//				System.out.println(nev);
			}else if (temp == 0){
				zero = zero + 1;
//				System.out.println(zero);
			}else {
				pos = pos + 1;
//				System.out.println(pos);
			}
		}
	}
}
