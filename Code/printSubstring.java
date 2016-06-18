package mainHome;

public class printSubstring {

	public static void main(String[] args) {
		printSub("abcd",' ');
	}
	public static void printSub (String str,char index){
		if (str.length() == 0){
			System.out.println(index);
			return;
		}
		char cc = str.charAt(0);
		String rest = str.substring(1);
		System.out.println(cc + rest);
		printSub (rest,cc);
		System.out.println(rest);
		printSub (rest,index);
	}
	public static void printKeyboard(String str,String index){
		
	}
	public static String[] sub (String str){
		
		String[] smaller = sub(str.substring(1));
		String[] current = new String [2*smaller.length];
		
		int counter = 0;
		for (String ss:smaller){
			current[counter] = ss;
			counter++;
		}
		for (String ss: smaller){
			current[counter] = str.charAt(0) + ss;
			counter++;
		}
		return current;
	}
}
