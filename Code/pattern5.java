package mainHome;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		int i = 0;
		int col,row = 0;
		while (i <= n){
			col = 0;
			while (col <= row){
				if(col == 0 && row == 0){
					System.out.println(1);
					break;
				}else if(col == 0){
					System.out.print(row);
					System.out.print("\t");
					col++;
				}
				while (row != 0 && row!=col){
					System.out.print(0);
					System.out.print("\t");
					col++;
				}
				if(row == col && row != 0 && col != 0){
					System.out.println(row);
					col++;
				}
			}
			row++;
			i++;
		}
	}

}
