package algo.string;
import java.util.ArrayList;
import java.util.Scanner;
public class CommonChild {

	public static void main(String[] args) {
		System.out.println("enter the two child String :");
		Scanner read = new Scanner (System.in);
		String one = read.nextLine();
		String two = read.nextLine();
		ArrayList<String> first = input(one, "");
		ArrayList<String> second = input(two, "");
		int ans = child(first, second);
		System.out.println(ans);
		read.close();
	}
	public static ArrayList<String> input (String str,String outputsofar){
		if (str.length() == 0){
			ArrayList<String> current = new ArrayList<>();
			current.add(str);
			return current;
		}
		ArrayList<String> current = new ArrayList<>();
		ArrayList<String> one = input(str.substring(1), outputsofar + "");
		ArrayList<String> two = input(str.substring(1), outputsofar + str.charAt(0));
		for (int i = 0;i < one.size();i++){
			current.add(one.get(i));
		}
		for (int i = 0;i < two.size();i++){
			current.add(two.get(i));
		}
//		System.out.println("11111111111111111111111");
//		System.out.println(one);
//		System.out.println("22222222222222222222222");
//		System.out.println(two);
//		System.out.println("************************");
		return current;
	}
	public static int child (ArrayList<String> one,ArrayList<String> two){
		int large = 0;
		int result = 0;
		for (int i = 0;i < one.size();i++){
			String first = one.get(i);
			large = first.length();
			for (int j = 0;j < two.size();j++){
				String second = two.get(j);
				if (first == second && result <= large){
					result = large;
				}
			}
		}
		return result;
	}
}
