package algo.string;

import java.util.ArrayList;
import java.util.Scanner;


public class MorganandaString {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("enter two string boy then girl :");
		String s1 = read.nextLine(); // boy and compulsory
		String s2 = read.nextLine(); // girl and not compulsory
//		ArrayList<String> al1 = per(s1);
//		ArrayList<String> al2 = per(s2);
//		System.out.println(al1);
//		String boy = findMax(al1);
//		System.out.println(boy);
//		System.out.println(al2);
//		String girl = findMax(al2);
//		System.out.println(girl);
//		String ans = findMorganMin(s1, s2);
//		System.out.println("*****************************");
//		System.out.println(ans);
		ArrayList<String> arr = makeArrayList(s1, s2);
		System.out.println(arr);
		System.out.println("******************");
		ArrayList<String> brr = sortList(arr);
		System.out.println(brr);
		System.out.println("******************");
		String ans = brr.get(brr.size() - 1);
		System.out.println("******************");
		System.out.println(ans);
		// JACK
		// DANIEL
	}
	public static ArrayList<String> makeArrayList(String boy,String girl){
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0;i < girl.length();i++){
			String temp = girl.substring(0,i)+boy+girl.substring(i,girl.length());
			System.out.println(temp);
			arr.add(temp);
		}
		String temp = girl + boy;
		arr.add(temp);
		return arr;
	}
	public static ArrayList<String> sortList (ArrayList<String> arr){
		ArrayList<String> brr = new ArrayList<>();
		for (int i = 0;i < arr.size();i++){
			String temp = findMax(arr);
			brr.add(temp);
			int index  = 0;
			for (int j = 0;j < arr.size();j++){
				if (temp == arr.get(j)){
					index = arr.indexOf(arr.get(j));
					break;
				}
			}
			arr.remove(index);
		}
		return brr;
	}
	public static String findMorganMin (String boy,String girl){
		String morgan = "";
		int count = 0;
		ArrayList<String> arr = morganHelper(boy, girl);
		arr.add(""); // test case
		for (int i = 0;i < arr.size();i++){
			String str = arr.get(i);
			int temp = value(str);
			if (temp >= count){
				morgan = arr.get(i); 
//				morgan = arr.get(i + 1); // this is true cheating here
				count = temp;
			}
		}
		return morgan;
	}
	public static ArrayList<String> morganHelper (String boy,String girl){
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0;i < girl.length();i++){ // reject boy at last
			String temp = girl.substring(0,i)+boy+girl.substring(i,girl.length());
			System.out.println(temp);
			arr.add(temp);
		}
		return arr;
	}
	public static String findMax (ArrayList<String> arr){
		int compare = 0;
		String ans = "";
		for (int i = 0;i < arr.size();i++){
			String str = arr.get(i);
			int temp = value(str);
			if (temp >= compare){
				ans = str;
				compare = temp;
			}
		}
		return ans;
	}
	public static int value (String str){
		int value = 0;
		for (int i = 0;i < str.length();i++){
			long temp = str.charAt(i);// need a type better than long
			for (int j = 0;j < i;j++){
				temp = temp*10;
			}
			value += temp;
		}
		return value;
	}
	public static ArrayList<String> per (String str){
		if (str.length() == 1){
			ArrayList<String> current = new ArrayList<>();
			current.add(str);
			return current;
		}
		ArrayList<String> current = new ArrayList<>();
		for (int i = 0;i < str.length();i++){
			
			char cc = str.charAt(i);
			String res = str.substring(0,i) + str.substring(i+1);
			ArrayList<String> resPer = per(res);
			for(int j = 0; j <resPer.size();j++){
				current.add(cc + resPer.get(j));
			}
		}
		return current;
	}
}
