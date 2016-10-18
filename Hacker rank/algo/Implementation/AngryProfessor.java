package algo.Implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
//		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int j = 0;
		int test = read.nextInt();
		while (j < test){
			int childCount = read.nextInt();
			int threshold = read.nextInt();
			int[] arr = new int [childCount];
			for (int i =0;i < childCount;i++){
				arr[i] = read.nextInt();
			}
			boolean show = checkCancel(arr,threshold);
			if (show == true){ // ( opposite ) means less than threshold
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			j++;
		}
	}
	public static boolean checkCancel (int[] arr,int threshold){
		int checkSum = 0;
		for (int i = 0;i < arr.length;i++){
			checkSum += arr[i];
		}
		if (checkSum >= threshold){
			return true;
		}else{
			return false;
		}
	}
}
