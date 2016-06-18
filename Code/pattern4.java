package mainHome;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		int i = 0;int col;
		int index = 0;
		while (i <= n){
			col = 0;
			while (col <= i){
				if (col == i){
					System.out.print("\n");
					break;
				}
				index = index + 1;
				System.out.print(index);
				System.out.print("\t");
				col = col + 1;
			}
			i = i + 1;
		}
	}

}
