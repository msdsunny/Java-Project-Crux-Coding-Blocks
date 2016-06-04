package mainHome;

import java.util.Scanner;

public class eleven {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();
		int temp = 0;
		while (temp < num){
			int col = 0;
			while (col <= temp){
				System.out.print("1");
				col = col + 1;
			}
			temp = temp + 1;
			System.out.println("\n");
		}

	}

}
