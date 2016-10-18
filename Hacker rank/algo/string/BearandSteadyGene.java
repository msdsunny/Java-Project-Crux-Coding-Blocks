package algo.string;

import java.util.Scanner;

public class BearandSteadyGene {
	public static void main(String[] args) {
		System.out.println("enter the length of string :");
		Scanner read = new Scanner (System.in);
		int length = read.nextInt();
		int i = 0;
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		String dna = "";
		while (i < length){
			char ch = str.charAt(i);
			dna += ch;
			i++;
		}
		int ans = checkBiggest(dna);
		System.out.println(ans);
	}
	public static int checkBiggest (String str){
		String sub = "";
		String largest = "";
		int length = 0;
		for (int i = 0;i < str.length() - 1;i++){
			int trip = 0;
			
			for (int j = i;j < str.length();j++){
				char ch = str.charAt(j);
				if (trip == 1){
					sub = "";
					length = 0;
					break;
				}
				if (ch == str.charAt(i + 1)){
					sub += ch;
					trip = -1;
				}else{
					sub += ch;
					trip = trip + 1;
				}
			}
			if (sub.length() >= largest.length()){
				largest = sub;
				length = largest.length();
			}
		}
		return length;
	}
}
