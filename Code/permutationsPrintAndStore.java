package mainHome;
import java.util.ArrayList;
public class permutationsPrintAndStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> aPoABC = permutations("cd");
		 System.out.println(aPoABC);

		 printPermutations("abcd", "");
	}
	public static ArrayList<String> permutations(String str) {
		if (str.length() == 1) {
			ArrayList<String> current = new ArrayList<>();

			current.add(str);

			return current;
		}

		ArrayList<String> current = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			char cC = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			ArrayList<String> rosPermutations = permutations(ros);

			for (int j = 0; j < rosPermutations.size(); j++) {
				current.add(cC + rosPermutations.get(j));
			}
		}

		return current;
	}

	public static void printPermutations(String str, String outputSoFar) {
		if (str.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cC = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			printPermutations(ros, outputSoFar + cC);
		}
	}
}
