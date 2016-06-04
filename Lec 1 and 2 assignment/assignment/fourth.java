package mainHome;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char child1 = read.next().charAt(0);
		char child2 = read.next().charAt(0);
		char child3 = read.next().charAt(0);
		int marks1 = read.nextInt();
		int marks2 = read.nextInt();
		int marks3 = read.nextInt();
		int best1 = marks1;
		int best2 = marks2;
		int i = 0;int temp;
		for(i=0;i<3;i++){
			if (marks1 > marks2){
				temp = marks1;
				marks1 = marks2;
				marks2 = temp;
			}
			if (marks2 > marks3){
				temp = marks2;
				marks2 = marks3;
				marks3 = temp;
			}
		}
		System.out.println(child3);
		System.out.println(marks3);
		System.out.println(child2);
		System.out.println(marks2);
				

	}

}
