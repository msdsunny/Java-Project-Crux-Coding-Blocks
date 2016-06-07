package lecthree;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		int  decimalnum,rem,i = 1,j;
		int[] arr = new int[100] ;
		System.out.println("write decimal no. :");
		Scanner read = new Scanner (System.in);
		int q = read.nextInt();
		
		while (q != 0){
			arr[i++] = q % 2;
			q = q/2;
		}
		
		for(j = i - 1;j > 0;j--){
			System.out.print(arr[j]);
		}
		
		
	}

}
