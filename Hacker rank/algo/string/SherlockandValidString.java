package algo.string;

import java.util.ArrayList;
import java.util.Scanner;

public class SherlockandValidString {
	public static int value ;
	public static void main(String[] args) {
		System.out.println("Hey Watson ! Enter a String here !!!");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		ArrayList<Integer> arr = giveArray(str);
//		System.out.println(arr);
		boolean ans = checkvalid(arr);
		if (ans == true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	public static boolean checkvalid (ArrayList<Integer> arr){
		int num = getMaxNo(arr);
//		System.out.println(num);
		int limit = 0;
		if (num == 0){
			return false;
		}
		if (num == 2){
			for (int i = 0;i < arr.size();i++){
				int item = arr.get(i);
				if (limit >= 2){ 
					return false;
				}
				if (num < item || num > item){
					limit ++;
				}
			}
			if (limit >= 2){ 
				return false;
			}
		}else{
			for (int i = 0;i < arr.size();i++){
				int item = arr.get(i);
				if (limit >= 3){ 
					return false;
				}
				if (num < item || num > item){
					limit ++;
				}
			}
			if (limit >= 3){ 
				return false;
			}
		}
		return true;
	}
	public static ArrayList<Integer> giveArray (String str){
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			int frequency = countFrequency(str, ch);
			arr.add(frequency);
		}
		return arr;
	}
	public static int countFrequency (String str,char item){
		int count = 0;
		for (int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			if (item == ch){
				count++;
			}
		}
		return count;
	}
	public static int getMaxNo (ArrayList<Integer> arr){
		int maximum = 0;
		int iterator = 0;
		for (int i = 0;i < arr.size();i++){
			int count = 0;
			int holdon = arr.get(i);
			for (int j = 0;j < arr.size();j++){
				int holdoff = arr.get(j);
				if (holdon  == holdoff){
					count++;
				}
			}
			if (iterator <= count){
				maximum = holdon;
				iterator = count;
			}
		}
		value = iterator;
		return maximum;
	}
}
