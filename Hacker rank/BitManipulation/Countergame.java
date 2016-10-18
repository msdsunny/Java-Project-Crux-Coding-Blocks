package BitManipulation;

import java.util.Scanner;

public class Countergame {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		int counter = 0;
		while (counter < test){
			int temp = read.nextInt();
			
			boolean value = tellWinner(temp);
			if (value = true){
				System.out.println("Louise");
			}else{
				System.out.println("Richard");
			}
			counter ++;
		}
	}
	public static boolean checkSquare (){
		return false;
	}
	public static boolean tellWinner (int num){
		boolean trigger = true;
		if (num == 1){
			return trigger;
		}
		while (num < 1){
			if(num % 2 == 0){
				
			}else{
				
			}
		}
		return trigger;
	}
}
