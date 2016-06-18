package mainHome;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();
		int temp = 0;
		while (temp <= num){
			int col = 0;
			while (col <= temp){
				if (col == 0){
					System.out.print("1");
				}else if(col >= 1 && col < temp){
					System.out.print("0");
				}else if(col == temp){
					System.out.print("1");
				}
				col = col + 1;
			}
			System.out.println("\n");
			temp = temp + 1;
		}

	}

}
