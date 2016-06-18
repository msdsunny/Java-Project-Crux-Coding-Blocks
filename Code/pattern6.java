package mainHome;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		int i = 0;
		int row = 0,col;
		while (i < n){
			col = 0;
			while (col <= row){
				if(col == 0 && row == 0){
					System.out.print(1);
					System.out.print("\n");
					col++;
				}else if(col == 0){
					System.out.print(1);
					System.out.print("\t");
					col++;
				}
				while (col != 0 && col != row && col < row){
					System.out.print(2);
					System.out.print("\t");
					col++;
				}
				if (col == row){
					System.out.println(1);
					col++;
				}
			}
			row++;
			i++;
		}
	}

}
