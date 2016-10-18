package algo;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		System.out.println("enter the no of steps :");
		Scanner read = new Scanner (System.in);
		int count = read.nextInt();
		for (int i = 0;i < count;i++){
			for (int j = 0;j < count - i;j++){
				System.out.print(" ");
			}
			for (int j = 0;j <= i;j++){
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}

}
