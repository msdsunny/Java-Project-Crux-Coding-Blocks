package mainHome;

//import java.util.ArrayList;

public class printPermutationsOfString {

	public static void main(String[] args) {
		printPer("abc"," ");
	}
	public static void printPer (String str,String outsofar){
		if (str.length() == 0){
			System.out.println(outsofar);
			return;
		}
		for (int i = 0;i < str.length();i++){
			
			char cc = str.charAt(i);
			String res = str.substring(0,i) + str.substring(i+1);
			printPer (res,outsofar + cc);
		}
		
	}
}
