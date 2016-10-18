package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
//		System.out.println("enter the no. of rows and coloums for square matris :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		for (int i = 0;i < size;i++){
			ArrayList<Integer> temp = new ArrayList<>();
			for (int j = 0;j < size;j++){
				int local = read.nextInt();
				temp.add(local);
			}
			arr.add(temp);
		}
		int a = diagonalArray1(arr);
		int b = diagonalArray2(arr);
		int ans = value(a, b);
		System.out.println(ans);
	}
	public static int value (int a,int b){
		int ans = a - b;
		if (ans < 0){
			return -ans;
		}else{
			return ans;
		}
	}
	public static int diagonalArray1 (ArrayList<ArrayList<Integer>> arr){
		int one = 0;
		int check = 0;
		for (int i = 0;i < arr.size();i++){
			ArrayList<Integer> temp = arr.get(i);
			for (int j = 0;j < arr.size();j++){
				if (check == j){
					int some = temp.get(j);
					one += some;
					check++;
					break;
				}
			}
		}
		return one;
	}
	public static int diagonalArray2 (ArrayList<ArrayList<Integer>> arr){
		int two = 0;
		int check = arr.size() - 1;
		for (int i = 0;i < arr.size();i++){
			ArrayList<Integer> temp = arr.get(i);
			for (int j = 0;j < arr.size();j++){
				if (check == j){
					int some = temp.get(j);
					two += some;
					check--;
					break;
				}
			}
		}

		return two;
	}
}
