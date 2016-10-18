import java.util.LinkedList;
import java.util.Scanner;

public class LargestRectangle {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		LinkedList<Integer> stack = new LinkedList<>();
		for (int i = 0;i < size;i++){
			int temp = read.nextInt();
			stack.addLast(temp);
		}
		int ans = maxRect(stack,size);
		System.out.println(ans);
	}
	// push - addFirst pop - removeFirst top - get(0) isEmpty - isEmpty size - size
	public static int maxRect (LinkedList<Integer> stack,int size){
		LinkedList<Integer> other = new LinkedList<>();
		int value = 0;
		int base = 1;
		int minPrev = 0;
		for (int  i = 0;i < size;i++){
			if (minPrev == 0){
				minPrev = stack.getFirst();
			}
			int current = stack.getFirst();
			stack.removeFirst();
			other.addFirst(current);
			if (current > base*Math.min(minPrev, current)){
				base = 1;
				minPrev = current;
				value = current;
			}else{
				base++;
				
				value  = base*Math.min(minPrev, current);
			}
		}
		return value;
	}
}
