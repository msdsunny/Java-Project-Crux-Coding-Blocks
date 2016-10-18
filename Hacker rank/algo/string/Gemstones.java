package algo.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Gemstones {

	public static void main(String[] args) {
		System.out.println("enter the size of array of strings :");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		size++;
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0;i < size;i++){
			String temp = read.nextLine();
			arr.add(temp);
		}
		arr.remove(0);
		System.out.println(arr);
		int ans = Gemstone(arr);
		System.out.println(ans);
	}
	public static int Gemstone (ArrayList<String> arr){
		String one = arr.get(0);
		int count = 0;
		boolean check = false;
		for (int i = 0;i < one.length();i++){
			char ch = one.charAt(i);
			for (int j = 0;j < arr.size();j++){
				String str = arr.get(j);
				check = checkInN(str, ch);
				if (check == false){
					break;
				}
			}
			if (check == true){
				count ++;
				check = false;
			}
		}
		return count;
	}
	public static boolean checkInN (String str,char a){
		for (int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			if (ch == a){
				return true;
			}
		}
		return false;
	}
}
