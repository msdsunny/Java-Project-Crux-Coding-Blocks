package mainHome;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner n = new Scanner (System.in);
		int upto = n.nextInt();
		int odd = 1;int even = 0;int counterodd = 0;int countereven = 0;
		while(odd <= upto){
			counterodd = counterodd + odd;
			odd = odd + 2;
		}
		while (even <= upto){
			countereven = countereven + even;
			even = even + 2;
		}
		System.out.println("the total odd is" + counterodd);
		System.out.println("the total even is" + countereven);
	}

}
