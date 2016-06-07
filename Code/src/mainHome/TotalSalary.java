package mainHome;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int basic = read.nextInt();
		char grade = read.next().charAt(0);
		double hra = 0.2*basic;
		double da = 0.5*basic;
		double pf = 0.11*basic;
		int allow = 0;
		int temp = grade;
		if (temp == 65){
			allow = 1700;
		}else if (temp == 66){
			allow = 1500;
		}else if (temp == 67){
			allow = 1300;
		}
		double t_sal = 0;
		t_sal = basic + hra + da + allow - pf;
		System.out.println("the total salary is :");
		System.out.println(t_sal);
		

	}

}
