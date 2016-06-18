package mainHome;

import java.util.Scanner;

public class wordLimit {
	public static void main(String[] args) {
		analyzeString();
	}
	public static void analyzeString(){
		Scanner s = new Scanner(System.in);
		int lines = 0, words = 0, chars = 0;
		boolean done = false;
		while(!done){
			String line = s.nextLine().trim();
			lines++;
			words++;
			for(int i = 0; i < line.length(); i++){
				if(line.charAt(i) == ' '){
					words++;
				}
				else if(line.charAt(i) == '$'){
					done = true;
					break;
				}			
				chars++;
			}
		}
		System.out.println("Lines: " + lines);
		System.out.println("Words: " + words);
		System.out.println("Chars: " + chars);
	}
}