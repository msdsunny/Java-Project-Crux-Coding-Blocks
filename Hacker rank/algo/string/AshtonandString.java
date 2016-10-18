package algo.string;
import java.util.ArrayList;
import java.util.Scanner;
public class AshtonandString {

	public static void main(String[] args) {
		System.out.println("enter the no. of test cases :");
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		read.nextLine();
		int i = 0;
		
		
		while (i < test){
			System.out.println("enter the string and integer :");
			String str = read.nextLine();
			System.out.println("enter the integer to char to be found :");
			int found = read.nextInt();
			read.nextLine();
			ArrayList<String> arr = substring(str);
			ArrayList<ArrayList<String>> ans = store(arr);
			ArrayList<ArrayList<String>> item = sortUsingASCII(ans);
			System.out.println(ans);
			System.out.println(item);
			ArrayList<String> lexo = lexicalArray(item);
			String total = finalString(lexo);
			char ch = getChar(total,found);
			System.out.println(ch);
			i++;
		}
		read.close();
	}
	public static ArrayList<String> lexicalArray (ArrayList<ArrayList<String>> arr){
		ArrayList<String> arrange = new ArrayList<>();
		for (int i = 0;i < arr.size();i++){
			String first = arr.get(0).get(i);
			arrange.add(first);
			char one = first.charAt(0);
			for (int j = 1;j < arr.size();j++){
				for (int k = 0;k < arr.size();k++){
					String second = arr.get(j).get(k);
					char two = second.charAt(0);
					if (one == two){
						arrange.add(second);
					}
				}
			}
		}
		return arrange;
	}
	public static String finalString (ArrayList<String> arr){
		String add = "";
		for (int i = 0; i< arr.size();i++){
			String local = arr.get(i);
			add += local;
		}
		return add;
	}
	public static char getChar (String str,int found){
		char main = str.charAt(found);
		return main;
	}
	public static ArrayList<ArrayList<String>> sortUsingASCII (ArrayList<ArrayList<String>> arr){
		ArrayList<ArrayList<String>> crr = new ArrayList<>();
		ArrayList<String> first = sortBaisc(arr.get(0));
		crr.add(first);
		for (int k = 0;k < first.size();k++){
//			System.out.println(arr);
			ArrayList<String> temp = arr.get(k );
//			System.out.println(temp);
			ArrayList<String> brr = new ArrayList<>();
			for (int l = 0;l < first.size();l++){
				String a  = first.get(l);
				char b = a.charAt(0);
				int c = b;
				for (int j = 0;j < temp.size();j++){
					String local = temp.get(j);
					char ch = local.charAt(0);
					int two = ch;
					if (c == two){
						brr.add(local);
					}
				}
			}
			if (k != 0){
			crr.add(brr);
			}
		}
		return crr;
	}
	public static ArrayList<String> sortBaisc (ArrayList<String> arr){
		ArrayList<String> crr = new ArrayList<>();
		int length = arr.size();
		for (int i = 0;i < length;i++){
					int compare = 200;
					String store = "";
					String least = "";
					int min = 0;
					char at ;
					for (int j = 0;j < arr.size();j++){
						least = arr.get(j);
						at = least.charAt(0);
						min = at;
						if (compare > min){
							compare = min;
							store = least;
						}
					}
					int index = arr.indexOf(store);
					crr.add(store);
					arr.remove(index);
		}
		return crr;
	}
	public static ArrayList<ArrayList<String>> store (ArrayList<String> arr){
		ArrayList<ArrayList<String>> result = new ArrayList<>();
		for (int i = 0;i < arr.size();i++){
			ArrayList<String> crr = new ArrayList<>();
			for (int j = 0;j < arr.size();j++){
				String temp = arr.get(j);
				if (temp.length() == i){
					crr.add(temp);
				}
			}
			if (crr.isEmpty() == false){
				result.add(crr);
			}
		}	
		return result;
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
}
