package mainHome;

public class stringPalindromeRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean stringPalindromeRec (String str){
		
		boolean temp = false;
		if (str.charAt(0) == str.charAt(str.length() - 1)){
			temp = stringPalindromeRec(str.substring(1));
		}else{
			return false;
		}
		return true;
	}
}
