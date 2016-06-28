package mainHome.temp;

import java.util.Scanner;

public class splitArrayInIncAndDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int current, prev, N;
Scanner s = new Scanner(System.in);
System.out.println("Please enter N");
N = s.nextInt();
System.out.println("Enter first number");
prev = s.nextInt();
boolean goingDown = true;
int counter = 2;
while(counter <= N)
{
	current = s.nextInt();
	
	if(goingDown)
	{
		if(current >= prev)
		{
			goingDown = false;
		}
	}
	else
	{
		if(current <= prev)
		{
			System.out.println("Invalid");
			return;
		}
	}
	prev = current;
	counter++;
}
System.out.println("Valid Pattern");
	}

}
