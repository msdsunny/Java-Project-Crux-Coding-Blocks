package algo;

import java.util.Scanner;

public class SavethePrisoner {

	public static void main(String[] args) {
//		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int i = 0;
		while (i < test){
			int prisoner = read.nextInt();
			int sweets = read.nextInt();
			int start = read.nextInt();
			int output = ( sweets + start - 1) % prisoner ;
			if (output == 0){
				System.out.println(prisoner);
			}else{
				System.out.println(output);
			}
			i++;
		}
	}
}
