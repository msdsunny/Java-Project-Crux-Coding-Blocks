import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DowntoZeroII {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int test = read.nextInt();
		LinkedList<Integer> queue = new LinkedList<>();
		int i = 0;
		while (i < test){
			int value = read.nextInt();
			queue.addLast(value);
			i++;
		}
		while (!queue.isEmpty()){
			int oper = queue.getFirst();
			queue.removeFirst();
			int ans = iter(oper);
			System.out.println(ans);
		}
	}
	public static int iter (int num){
		int count = 0;
		int temp = num;
		while (temp > 0){
			pair store = factors(temp);
			if (store == null){
				temp--;
			}else if(store.one == 1 && store.two == 1){
				temp--;
			}else{
				int value = Math.min(temp - 1, Math.max(store.one, store.two));
				temp = value;
			}
			count++;
		}
		return count;
	}
	public static class pair {
		int one;
		int two;
		public pair (int one,int two){
			this.one = one;
			this.two = two;
		}
		public void setOne (int one){
			this.one = one;
		}
		public void setTwo (int two){
			this.two = two;
		}
	}
	public static pair factors (int num){
		ArrayList<pair> arr = new ArrayList<>();
		for (int i = 1;i <= num;i++){
			if ( num % i == 0){
				pair value = new pair(i, num/i) ;
				arr.add(value);
			}
		}
		if (arr.size() <= 2){
			return null;
		}
		pair ref = new pair(Integer.MAX_VALUE, Integer.MAX_VALUE);
		for (int i = 0;i < arr.size();i++){
			pair check = arr.get(i);
			if (Math.max(ref.one, ref.two) > Math.max(check.one, check.two)){
				ref.setOne(check.one);
				ref.setTwo(check.two);
			}
		}
		return ref;
	}
}
