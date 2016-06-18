package mainHome;

import java.util.Scanner;

public class nokiaPattern {

	public static void main(String[] args) {
		System.out.println("enter the no.");
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();
		String[] str = keypad (num);
		output(str);
	}
	public static void output(String[] arr){
		int j = 0;
		while (j < arr.length){
			System.out.println(arr[j]);
			j++;
		}
	}
	public static String value (int arr){
		String s = " ";
			if (arr == 1){
				s = "abc";
			}else if(arr == 2){
				s = "def";
			}else if(arr == 3){
				s = "ghi";
			}else if(arr == 4){
				s = "jkl";
			}else if(arr == 5){
				s = "mno";
			}else if(arr == 6){
				s = "pqr";
			}else if(arr == 7){
				s = "stu";
			}else if(arr == 8){
				s = "vwx";
			}else if(arr == 9){
				s = "yz";
			}else{
				System.out.println("wrong input");
			}
		return s;
	}
	public static String[] keypad (int num){
		if (num == 0){
			return new String[] {""};
		}
		String[] smaller = keypad(num/10);
		
		String str;
		int rem = num%10;
		str = value(rem);
		
		//String[] smaller = keypad(str.substring(1));
		String[] current = new String [3*smaller.length];
		
		int counter = 0;
		for (String ss:smaller){
			current[counter] = ss + str.charAt(0);
			counter++;
		}
		for (String ss: smaller){
			current[counter] = ss + str.charAt(1);
			counter++;
		}
		if (rem != 9){
		for (String ss: smaller){
			current[counter] = ss+ str.charAt(2);
			counter++;
		}
		}
		return current;
	}

}
