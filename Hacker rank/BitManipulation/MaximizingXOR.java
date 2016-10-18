package BitManipulation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MaximizingXOR {
	public static void main(String[] args) {
//		System.out.println("enter the two numbers :");
		Scanner read = new Scanner (System.in);
		int one = read.nextInt();
		int two = read.nextInt();
		int ans = MaxXOR(one, two);
		System.out.println(ans);
	}
	public static int MaxXOR (int one,int two){
		ArrayList<Integer> arr = new ArrayList<>();
		int max = 0;
		if (one == two){
			return 0;
		}else if (one < two){
			for (int i = one;i <= two;i++){
				int num1 = i;
				for (int j = one;j <= two;j++){
					int num2 = j;
					int temp = operations(num1, num2);
					arr.add(temp);
					if (max < temp){
						max = temp;
					}
				}
			}
		}else if(one > two){
			for (int i = two;i <= one;i++){
				int num1 = i;
				for (int j = two;j <= one;j++){
					int num2 = j;
					int temp = operations(num1, num2);
					arr.add(temp);
					if (max < temp){
						max = temp;
					}
				}
			}
		}
		return max;
	}
	public static int operations (int one,int two){
		if (one == two){
			return 0;
		}
		ArrayList<Integer> first = binary(one);
		ArrayList<Integer> second = binary(two);
		if (first.size() != second.size()){
			if( first.size() > second.size() ){
				int value = first.size() - second.size();
				for (int i = 0;i < value;i++){
					second.add(0, 0);
				}
			}else if(first.size() < second.size() ){
				int value = second.size() - first.size();
				for (int i = 0;i < value;i++){
					first.add(0, 0);
				}
			}
		}
		return XORvalue(first, second);
	}
	public static int XORvalue (ArrayList<Integer> first,ArrayList<Integer> second){
		ArrayList<Integer> value = new ArrayList<>();
		for (int i = 0;i < first.size();i++){
			if (first.get(i) == second.get(i)){
				value.add(0);
			}else if (first.get(i) != second.get(i)){
				value.add(1);
			}
		}
		return decimal(value);
	}
	public static int decimal (ArrayList<Integer> arr){
		int temp = 0;
		int power = arr.size() - 1;
		for (int i = 0;i < arr.size();i++){
			temp = (temp + arr.get(i)*(int)Math.pow(2, power));
			power = power - 1;
		}
		return temp;
	}
	public static ArrayList<Integer> binary (int num){
		LinkedList<Integer> arr = new LinkedList<>();
		int temp = num;
		while (temp > 0){
			if (temp % 2 == 0){
				arr.addFirst(0);
				temp = temp / 2;
			}else{
				arr.addFirst(1);
				temp = temp - 1;
				temp = temp / 2;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0;i < arr.size();i++){
			list.add(arr.get(i));
		}
		return list;
	}
}