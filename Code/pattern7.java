package mainHome;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		int i = 0;
		int row = 0,col;
		while (i <= n){
			col = 0;
			int temp = n - i;
			while (col <= row){
				System.out.print(temp);
				col++;
			}
			System.out.print("\n");
			row++;
			i++;
		}
	}

}
