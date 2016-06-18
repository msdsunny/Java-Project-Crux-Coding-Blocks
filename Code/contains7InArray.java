package mainHome;

import java.util.Scanner;

public class contains7InArray {

	public static void main(String[] args) {
		int[] arr = input();
		int index = 0;
		//System.out.println(contain7 (arr));
		//System.out.println(firstIndex (arr,index));
		System.out.println(lastIndex (arr,index));
	}
	public static int lastIndex (int[] arr,int index){
		if (arr.length == 0){
			
			return -1;
		}
		if (arr.length == 1){
			if (arr[0] == 7){
				return index;
			}else{
				return -1;
			}
		}
		index++;
		int[] ar = new int[arr.length - 1];
		for (int i = 0;i < arr.length-1;i++){
			arr[i] = arr[i + 1];
		}
		//index--;
		return lastIndex(ar,index);
		
	}
	public static int firstIndex (int[] arr,int index){
		int length = arr.length;
		if (arr.length == 0){
			return -1;
		}
		if (arr.length == 1){
			if (arr[0] == 7){
				return 0;
			}else{
				return -1;
			}
		}
		if (arr[0] == 7){
			return index;
		}else{
			
			int[] ar = new int[arr.length - 1];
			for (int i = 0;i < ar.length;i++){
				ar[i] = arr[i+1];
			}
			index++;
			return firstIndex(ar,index);
		}
	}
	public static boolean contain7 (int[] arr){
		int length = arr.length;
		if (arr.length == 0){
			return false;
		}
		if (arr.length == 1){
			if (arr[0] == 7){
				return true;
			}else{
				return false;
			}
		}
		if (arr[0] == 7){
			return true;
		}else {
			int[] ar = new int[arr.length - 1];
			for (int i = 0;i < ar.length;i++){
				ar[i] = arr[i + 1];
			}
			return contain7(ar);
			
		}
	}
	public static int[] input(){
		System.out.println("enter the size");
		Scanner read = new Scanner (System.in);
		int size = read.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while (i < size){
			System.out.println("enter the " + i +"th element");
			arr[i] = read.nextInt();
			i++;
		}	
		return arr;
	}
}
