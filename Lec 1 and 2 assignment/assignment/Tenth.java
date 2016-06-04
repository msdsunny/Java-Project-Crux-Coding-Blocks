package mainHome;

import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		double a = read.nextDouble();
		double b = read.nextDouble();
		double c = read.nextDouble();
		double root1 = 0;
		double root2 = 0;
		if (b*b - 4*a*c < 0){
			System.out.println("It have the imag roots ");
			return;
		}else if(4*a*c > 0){
			root1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
			root2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		}
		System.out.println("roots are");
		System.out.println(root1);
		System.out.println(root2);
		
	}

}
