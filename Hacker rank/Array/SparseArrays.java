package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int one = read.nextInt();
		ArrayList<String> arr = input(one,read);
		int two = read.nextInt();
		ArrayList<String> brr = input(two,read);
		int[] crr = value(arr, brr);
		for (int i = 0;i < crr.length;i++){
			System.out.println(crr[i]);
		}
	}
	public static int[] value (ArrayList<String> arr,ArrayList<String> brr){
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0;i < brr.size();i++){
			int count = 0;
			String get = brr.get(i);
			for (int j = 0;j < arr.size();j++){
				String check = arr.get(j);
				if (check.equals(get)){
					count ++;
				}
			}
			temp.add(count);
		}
		int[] result = new int[temp.size()];
		for (int i = 0;i < temp.size();i++){
			result[i] = temp.get(i);
		}
		return result;
	}
	public static ArrayList<String> input (int num,Scanner read){
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0;i < num;i++){
			String temp = read.next();
			arr.add(temp);
		}
		return arr;
	}
}
