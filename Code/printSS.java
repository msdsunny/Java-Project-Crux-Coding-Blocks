package mainHome;

public class printSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printSS("abcd", "");
	}
	public static void printSS(String str, String outputSoFar) {
		if (str.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}

		printSS(str.substring(1), outputSoFar + "");
		printSS(str.substring(1), outputSoFar + str.charAt(0));
	}
}
