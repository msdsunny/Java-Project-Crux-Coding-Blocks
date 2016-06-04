package mainHome;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the pri");
		int pri = a.nextInt();
		System.out.println("enter the time");
		int time = a.nextInt();
		System.out.println("enter the rate");
		int rate = a.nextInt();
		int SimpleIntrest;
		SimpleIntrest = pri*rate*time/100;
		System.out.println("The Simple Intrest is :" + SimpleIntrest);
		int totalAmount = time + SimpleIntrest;
		System.out.println("The total amount is :" + totalAmount);

	}

}
