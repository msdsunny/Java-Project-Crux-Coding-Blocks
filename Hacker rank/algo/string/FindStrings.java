package algo.string;

import java.util.ArrayList;
import java.util.Scanner;

public class FindStrings {

	public static void main(String[] args) {
		System.out.println("enter the total count of strings :");
		Scanner read = new Scanner (System.in);
		int count = read.nextInt();
		int i = 0;
		ArrayList<String> arr = new ArrayList<>();
		Scanner in = new Scanner (System.in);
		while (i < count){
			String temp = in.nextLine();
			arr.add(temp);
			i++;
		}
		System.out.println(arr); // check
		ArrayList<ArrayList<String>> brr = subStringN(arr);
		System.out.println(brr); // check
		ArrayList<ArrayList<String>> crr = sortLex(brr);
		System.out.println(crr); // check
		ArrayList<String> drr = addAll(crr);
		System.out.println(drr); // check
		ArrayList<String> err = deleteDub(drr);
		System.out.println(err); // check
		int size = read.nextInt();
		int j = 0;
		while (j < size){
			int index = in.nextInt();
			String local = getString(err,index);
			System.out.println(local);
			j++;
		}
		read.close();
	}
//  find sub string of n strings
//	delete all the duplicates sub strings
//	add all substrings to one ArrayList<String> 
//	give all strings to its priority
//	sort in lexical form
//	find string at m in S1 U to Sn in lexical pattern
	public static ArrayList<ArrayList<String>> subStringN (ArrayList<String> arr){
		ArrayList<ArrayList<String>> brr = new ArrayList<>();
		for (int i = 0;i < arr.size();i++){
			String temp = arr.get(i);
			ArrayList<String> crr = substring(temp);
			brr.add(crr);
		}
		return brr;
	}
	public static ArrayList<String> substring (String str){
		ArrayList<String> arr = new ArrayList<>();
		int length = str.length();
		int i = 0;
		while (i <= length){
			int j = 0;
			while (j <= length){
				if (i < j){
					arr.add(str.substring(i,j));
				}
				j++;
			}
			i++;
		}
		return arr;
	}
	public static ArrayList<String> deleteDub (ArrayList<String> brr){
		ArrayList<String> arr = brr;
		for (int i = 0;i < arr.size();i++){
			String str = arr.get(i);
			for (int j = 0;j < arr.size();j++){
				String local = arr.get(j);
				if (i == j){
					// nothing
				}else{
					if (str == local){
					arr.remove(j);
					}
				}
			}
		}
		return arr;
	}
	public static ArrayList<String> addAll (ArrayList<ArrayList<String>> arr){
		
		return null;
	}
	public static ArrayList<ArrayList<String>> sortLex (ArrayList<ArrayList<String>> arr){
		
		return null;
	}
	public static ArrayList<String> lexicalHelper (ArrayList<String> arr){
		
		return null;
	}
	public static String getString (ArrayList<String> arr,int index){
		
		return null;
	}
}