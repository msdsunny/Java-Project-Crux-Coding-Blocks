package algo.BitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class XoringNinja {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i = 0;
		while (i < test){
			int size = read.nextInt();
			int[] arr = new int [size];
			for (int j =0;j < size;j++){
				arr[i] = read.nextInt();
			}
			
			i++;
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 printSS("abcd", "");
//	}
//	public static void printSS(String str, String outputSoFar) {
//		if (str.length() == 0) {
//			System.out.println(outputSoFar);
//			return;
//		}
//
//		printSS(str.substring(1), outputSoFar + "");
//		printSS(str.substring(1), outputSoFar + str.charAt(0));
//	}
	public static long returnsMod (long num){
		return num% 1000000007;
	}
	public static ArrayList<ArrayList<Integer>> crr = new ArrayList<>();
	public static ArrayList<ArrayList<Integer>> returnSubstringArray (ArrayList<Integer> arr,ArrayList<Integer> outputSoFar){
		ArrayList<ArrayList<Integer>> crr = new ArrayList<>();
		
		return crr;
	}
}
