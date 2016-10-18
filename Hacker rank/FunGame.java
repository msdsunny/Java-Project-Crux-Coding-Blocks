import java.util.ArrayList;
import java.util.Scanner;

public class FunGame {

	public static void main(String[] args) {
	Scanner read = new Scanner (System.in);
	int test = read.nextInt();
	int i = 0;
	while (i < test){
		int size = read.nextInt();
		int[] arr = new int[size];
		for (int j = 0;j < size;j++){
			arr[j] = read.nextInt();
		}
		int[] brr = new int[size];
		for (int j = 0;j < size;j++){
			brr[j] = read.nextInt();
		}
		int ans = winner(arr, brr);
		if (ans == 0){
			System.out.println("Tie");
		}else if(ans == 1){
			System.out.println("First");
		}else if(ans == 2){
			System.out.println("Second");
		}
		i++;
	}
	}
	public static int winner (int[] arr,int[] brr){
		ArrayList<Integer> one = arrToList(arr);
		ArrayList<Integer> two = arrToList(brr);
		int sumone = 0;
		int sumtwo = 0;
		boolean turn = true;
		for (int i = 0;i < arr.length;i++){
			if (turn){
				int value = greatest(one);
				one.remove(one.indexOf(value));
				sumone = sumone + value;
				turn = false;
			}else{
				int value = greatest(two);
				two.remove(two.indexOf(value));
				sumtwo = sumtwo + value ;
				turn = true;
			}
		}
		int ans = 0;
		if (sumone == sumtwo){
			ans = 0;
		}else if(sumone > sumtwo){
			ans = 1;
		}else{
			ans = 2;
		}
		return ans;
	}
	public static int greatest (ArrayList<Integer> arr){
		int retval = 0;
		for (int i = 0;i < arr.size();i++){
			if (arr.get(i) >= retval){
				retval = arr.get(i);
			}
		}
		return retval;
	}
	public static ArrayList<Integer> arrToList (int[] arr){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0;i < arr.length;i++){
			list.add(arr[i]);
		}
		return list;
	}
}
