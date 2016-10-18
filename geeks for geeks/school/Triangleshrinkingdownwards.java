package school;

import java.util.Scanner;

public class Triangleshrinkingdownwards {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int i = 0;
		while (i <= size){
			String str = read.nextLine();
			printString(str);
			i++;
		}
		read.close();
	}
	public static void printString(String str){
		for (int i = 0;i < str.length();i++){
			for (int j = 0 ;j < i;j++){
				System.out.print(".");
			}
			System.out.println(str.substring(i));
		}
	}
}
