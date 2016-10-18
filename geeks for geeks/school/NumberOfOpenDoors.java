package school;

import java.util.Scanner;

public class NumberOfOpenDoors {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int i = 0;
		while (i < size){
			int num = read.nextInt();
			int sum = perfectSquare(num);
			System.out.println(sum);
			i++;
		}
	}
	public static int perfectSquare (int num){
		int total = 0;
		for (int j = 0;j < num;j++){
			if(j*j == 1){
				//nothing
			}else if (j*j < num){
				total++;
			}
		}
		return total;
	}
}
