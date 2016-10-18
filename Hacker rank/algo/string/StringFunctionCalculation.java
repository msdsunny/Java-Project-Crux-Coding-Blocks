package algo.string;
import java.util.ArrayList;
import java.util.Scanner;
public class StringFunctionCalculation {

	public static void main(String[] args) {
		System.out.println("enter a string :");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		countIterationInString(str);
		printPattern();
		int ans = findMaximum();
		System.out.println(ans);
//		System.out.println(master);
//		System.out.println(slave);
		read.close();
	}
	public static ArrayList<String> master = new ArrayList<>();
	public static ArrayList<Integer> slave = new ArrayList<>();
	public static void countIterationInString (String str){
		for (int i = 0;i < str.length();i++){
			for (int j = i + 1;j < str.length();j++){
				String main = str.substring(i,j);
//				System.out.println(main);
//				System.out.println("11111111111");
				int count = 0;
				for (int k = 0;k < str.length();k++){
					for (int l = k + 1;l < str.length();l++){
						String temp = str.substring(k, l);
//						System.out.println(temp);
//						System.out.println("22222222222222");
						if (main == temp){ // why this is false always
							System.out.println(main);
							master.add(main);
							count++;
						}
					}
				}
//				System.out.println(count);
//				System.out.println("end");
				slave.add(count);
			}
		}
	}
	public static int findMaximum (){
		int largest = 0;
		for (int i = 0;i < slave.size();i++){
			if (largest <= slave.get(i)){
				largest = slave.get(i);
			}
		}
		return largest;
	}
	// print pattern
	public static void printPattern (){
		for (int i = 0;i < master.size();i++){
			System.out.println("f('" + master.get(i) + "') = " + slave.get(i));
		}
	}
}
