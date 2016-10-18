package algo.string;

import java.util.ArrayList;
import java.util.Scanner;

public class PseudoIsomorphicSubstrings {

	public static void main(String[] args) {
		System.out.println("enter a string between whose sub string may contain pseudo isomorphic strings :");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		ans = master(str);
//		System.out.println(ans);
		deletePseudoIsomorphic(ans);
		ArrayList<Integer> local = remaingString(ans);
		int[] array = new int[local.size()];
		for (int i = 0;i < array.length;i++){
			array[i] = local.get(i);
		}
		for (int i = 0;i < array.length;i++){
			System.out.println(array[i]);
		}
//		System.out.println(local);
		read.close();
	}
	// one array list that store no. of pseudo isomorphic strings ArrayList<Integer>
	// two array list ArrayList<ArrayList<String>>
	// make array list of substring ArrayList<String> and return it to two
	// delete all pseudo isomorphic nodes in one then store in two
	// optional a function check the ArrayList<String> and then delete String
	public static ArrayList<ArrayList<String>> master (String str){
//		ArrayList<String> arr = slave(str);
//		removeEmpty(arr);
//		System.out.println(arr);
		ArrayList<ArrayList<String>> boss = new ArrayList<>();
		for (int i = 1;i <= str.length();i++){
			String temp =str.substring(0, i);
			ArrayList<String> local = slave(temp);
//			removeEmpty(local);
			boss.add(local);
		}
		return boss;
	}
	public static void removeEmpty (ArrayList<String> temp){
		String local = "";
		String main = " ";
		for (int i = 0;i < temp.size();i++){
			String let = temp.get(i);
			if (local == let || main == let){
				temp.remove(i);
			}
		}
	}
	public static ArrayList<Integer> remaingString (ArrayList<ArrayList<String>> arr){
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 0;i < arr.size();i++){
			ArrayList<String> at = arr.get(i);
			int count = 0;
			for (int j = 0;j < at.size();j++){
				count++;
			}
			num.add(count);
		}
		return num;
	}
	public static void deletePseudoIsomorphic (ArrayList<ArrayList<String>> arr){
		for (int i = 0;i < arr.size();i++){
			ArrayList<String> crr = arr.get(i);
			deletePseudoIsomorphicHelper(crr);
		}
	}
	public static void deletePseudoIsomorphicHelper (ArrayList<String> arr){
		for (int i = 0;i < arr.size();i++){
			String a = arr.get(i);
			for (int j = i + 1;j < arr.size();j++){
				String b = arr.get(j);
				if (a.length() == b.length()){
					boolean all = true;
					boolean checka = false;
					boolean checkb = false;
					for (int k = 0;k < a.length() - 1;k++){ 
						char cha = a.charAt(k);
						char chb = b.charAt(k);
						char chaNext = a.charAt(k + 1);
						char chbNext = b.charAt(k + 1);
						if (cha == chaNext){
							checka = true;
						}else{
							checka = false;
						}
						if (chb == chbNext){
							checkb = true;
						}else{
							checkb = false;
						}
						if (checka == checkb){
							all = true; // mapping is same !! sorry
						}else{
							all = false; // bach gaya yaar
						}
						if (all == false){
							break;
						}
					}
					if (all == true){
						arr.remove(j);
					}
				}
			}
		}
	}
	public static boolean cheakSubstringForIsomorphic (ArrayList<String> arr){
		return false;
	}
	public static ArrayList<String> slave (String str){
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
//		for (int i = 0;i < str.length();i++){
//			for (int j = i ;j < str.length();j++){
//					arr.add(str.substring(i,j));
//			}
//		}
		return arr;
	}
}
