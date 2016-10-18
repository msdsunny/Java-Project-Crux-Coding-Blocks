package algo.string;
import java.util.Scanner;
public class SuperReducedString {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		String ans = helper(str);
		if (ans == ""){
			System.out.println("Empty String");
		}else{
			System.out.println(ans);
		}
	}
	public static String reduceString (String str){
		String test = "";
		String limit = "";
		String operations = "";
		for (int i = 0;i < str.length() - 1;i = i + 2){
			if (i + 1 > str.length() - 1){
				break;
			}
			test = str.substring(i,i+1);
			limit = str.substring(i+1, i+2);
			if (test.equals(limit)){
//				nothing
			}else if(test.equals(limit) == false){
				operations += test + limit ;
			}
		}
		if (str.length() % 2 == 1){
			operations += str.charAt(str.length() - 1);
		}
		return operations;
	}
	public static String reduceString2 (String str){
		String test = "";
		String limit = "";
		String operations = "";
		for (int i = 1;i < str.length() - 1;i = i + 2){
			if (i + 1 > str.length() - 1){
				break;
			}
			test = str.substring(i,i+1);
			limit = str.substring(i+1, i+2);
			if (test.equals(limit)){
//				nothing
			}else if(test.equals(limit) == false){
				operations += test + limit ;
			}
		}
		String s = str.substring(0,1);
		operations = s + operations;
		if (str.length() % 2 == 0){
			operations += str.charAt(str.length() - 1);
		}
		return operations;
	}
	public static String helper (String str){
		String value = reduceString(str);
		for (int i = 0;i < str.length();i++){
			if (value == ""){
				return "";
			}
			value = reduceString2(value);
			if (value == ""){
				return "";
			}
			value = reduceString(value);
			if (value == ""){
				return "";
			}
		}
		return value;
	}
}